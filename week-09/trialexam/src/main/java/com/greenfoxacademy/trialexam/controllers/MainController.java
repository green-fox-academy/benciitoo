package com.greenfoxacademy.trialexam.controllers;

import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private AliasService aliasService;

    @Autowired
    public MainController(AliasService aliasService){
        this.aliasService = aliasService;
    }


    @GetMapping(value = "/")
    public String loadMainpage(Model model){
        if (aliasService.getServiceHelper().isRedirected() && aliasService.getServiceHelper().isSuccess()) {
            aliasService.getServiceHelper().setRedirected(false);
            model.addAttribute("servicehelper", aliasService.getServiceHelper());
            model.addAttribute("newalias", new Alias());
            model.addAttribute("tempAlias", aliasService.getTempAlias());
        } else if (aliasService.getServiceHelper().isRedirected() && aliasService.getServiceHelper().isExists()){
            aliasService.getServiceHelper().setRedirected(false);
            model.addAttribute("servicehelper", aliasService.getServiceHelper());
            model.addAttribute("newalias", aliasService.getTempAlias());
        } else if (!aliasService.getServiceHelper().isRedirected()){
            aliasService.getServiceHelper().setHelperBooleansToFalse();
            model.addAttribute("servicehelper", aliasService.getServiceHelper());
            model.addAttribute("newalias", new Alias());
        }
        return "index";
    }


    @PostMapping(value = "/save-link")
    public String saveAlias(@ModelAttribute ("newalias") Alias newalias){
        aliasService.getServiceHelper().setHelperBooleansToFalse();
        aliasService.saveNewAlias(newalias);
        return "redirect:/";
    }


    @GetMapping(value = "/a/{alias}")
    public String incrementAliasHitCount (@PathVariable ("alias") String aliasToFind){
        if (aliasService.containsAlias(aliasToFind)) {
            Alias foundAlias = aliasService.findAlias(aliasToFind);
            foundAlias.setHitCount(foundAlias.getHitCount() + 1);
            aliasService.save(foundAlias);
            return "redirect:/";
        } else {
            return "error";
        }
    }


}