package com.greenfoxacademy.trialexam.controllers;


import com.greenfoxacademy.trialexam.models.Alias;
import com.greenfoxacademy.trialexam.service.AliasService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MainController {

    private AliasService aliasService;

    @Autowired
    public MainController(AliasService aliasService){
        this.aliasService = aliasService;
    }

    @GetMapping(value = "/")
    public String loadMainpage(Model model){
        model.addAttribute("newalias", new Alias());
        if (!model.asMap().containsKey("exist")){
            model.addAttribute("first_load", true);
            model.addAttribute("exist", false);
        } else {
            model.addAttribute("exist", true);
        }


        return "index";
    }

    @PostMapping(value = "/save-link")
    public ModelAndView saveAlias(ModelMap model, @ModelAttribute ("newalias") Alias newalias){
        if (!aliasService.containsAlias(newalias.getAlias())) {
            aliasService.saveAlias(newalias);
        }
        model.addAttribute("exist", aliasService.containsAlias(newalias.getAlias()));
        aliasService.saveAlias(newalias);
        return new ModelAndView("redirect:/", model);
    }


}