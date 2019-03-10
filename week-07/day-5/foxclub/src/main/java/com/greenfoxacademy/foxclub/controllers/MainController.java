package com.greenfoxacademy.foxclub.controllers;

import com.greenfoxacademy.foxclub.models.Fox;
import com.greenfoxacademy.foxclub.models.FoxListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller

public class MainController {

    FoxListService foxListService;

    @Autowired
    public MainController(FoxListService foxListService) {
        this.foxListService = foxListService;
    }


    @GetMapping(value = "/")
    public String getIndexPage(Model model, @RequestParam(value = "username", required = false, defaultValue = "Fox") String name) {
        model.addAttribute("name", name);
        model.addAttribute("actualFox", foxListService.getFox(name));
        return "index";
    }

    @GetMapping(value = "/login")
    public String loginPage() {
        return "login";
    }

    @PostMapping(value = "/login")
    public String loginPagePost(Model model, String name) {
        return "redirect:/?username=" + name;

        //Ez az optional része volt a Login page-nek, de ellentmond a logikával, ha továbbcsinálom a feladatot.
        /*
        boolean isss = true;
        if (foxListService.isItIn(name)){
            return "redirect:/?username=" + name;
        } else if (name.equals("")) {
            return "redirect:/login";
        }
        else {
            if (!foxListService.isItIn(name))
                model.addAttribute("already", isss);
            return "login";
        }*/
    }

}