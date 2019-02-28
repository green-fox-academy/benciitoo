package com.mywebshop.bencewebshop.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloController {

    @RequestMapping("/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("myname", name);
        return "greeting";
    }
}
