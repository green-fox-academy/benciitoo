package com.greenfoxacademy.trialexam.controllers;

import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.models.SecretCodeObject;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    private AliasService aliasService;

    @Autowired
    public MainController(AliasService aliasService) {
        this.aliasService = aliasService;
    }


    @GetMapping(value = "/")
    public String loadMainpage(Model model) {
        if (aliasService.getServiceHelper().isRedirected() && aliasService.getServiceHelper().isSuccess() && !aliasService.getServiceHelper().isExists()) {
            aliasService.getServiceHelper().setRedirected(false);
            model.addAttribute("servicehelper", aliasService.getServiceHelper());
            model.addAttribute("newalias", new Alias());
            model.addAttribute("tempAlias", aliasService.getTempAlias());
        } else if (aliasService.getServiceHelper().isRedirected() && aliasService.getServiceHelper().isExists() && !aliasService.getServiceHelper().isSuccess()) {
            aliasService.getServiceHelper().setRedirected(false);
            model.addAttribute("servicehelper", aliasService.getServiceHelper());
            model.addAttribute("newalias", aliasService.getTempAlias());
        } else if (!aliasService.getServiceHelper().isRedirected()) {
            aliasService.getServiceHelper().setSuccess(false);
            aliasService.getServiceHelper().setExists(false);
            model.addAttribute("servicehelper", aliasService.getServiceHelper());
            model.addAttribute("newalias", new Alias());
        }
        return "index";
    }


    @PostMapping(value = "/save-link")
    public String saveAlias(@ModelAttribute("newalias") Alias newalias) {
        aliasService.getServiceHelper().setExists(false);
        aliasService.getServiceHelper().setSuccess(false);
        aliasService.saveNewAlias(newalias);
        return "redirect:/";
    }


    @GetMapping(value = "/a/{alias}")
    public Object incrementAliasHitCount(@PathVariable("alias") String aliasToFind) {
        if (aliasService.existByAlias(aliasToFind)) {
            Alias foundAlias = aliasService.findAlias(aliasToFind);
            foundAlias.setHitCount(foundAlias.getHitCount() + 1);
            aliasService.save(foundAlias);
            return "redirect:" + foundAlias.getUrl();
        } else {
            ResponseEntity responseEntity = new ResponseEntity(HttpStatus.NOT_FOUND);
            return responseEntity;
        }
    }


    @GetMapping(value = "/api/links")
    @ResponseBody
    public Object getAliasesList() {
        return aliasService.getAllAliases();
    }


    @DeleteMapping(value = "api/links/{id}")
    @ResponseBody
    public Object deleteAlias(@PathVariable(value = "id") long id, @RequestBody SecretCodeObject secretCode) {
        if (aliasService.existsById(id) && !secretCode.getSecretCode().equals(aliasService.findById(id).getSecretNumber())) {
            ResponseEntity responseEntity = new ResponseEntity("Error 403", null, HttpStatus.FORBIDDEN);
            return responseEntity;
        } else if (aliasService.existsById(id) && secretCode.getSecretCode().equals(aliasService.findById(id).getSecretNumber())) {
            aliasService.deleteById(id);
            ResponseEntity responseEntity = new ResponseEntity("Status code: 204", null, HttpStatus.NO_CONTENT);
            return responseEntity;
        } else {
            ResponseEntity responseEntity = new ResponseEntity("Error 404", null, HttpStatus.NOT_FOUND);
            return responseEntity;
        }
    }
}