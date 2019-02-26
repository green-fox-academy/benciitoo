package com.greenfoxacademy.springstart.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.concurrent.atomic.AtomicLong;

@Controller

public class HelloWebController {
    private AtomicLong newCounter = new AtomicLong(1);

    @RequestMapping("/web/greeting")
    public String greeting(Model model, @RequestParam String name) {
        model.addAttribute("yourname", name);
        model.addAttribute("countme", newCounter.getAndIncrement());
        return "greeting"; //ez a greeting.html-t fogja visszaadni. Ha lenne @ResponseBody, akkor visszaadná a "greeting"-et
    }
}