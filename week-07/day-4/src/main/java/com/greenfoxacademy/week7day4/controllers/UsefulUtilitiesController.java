package com.greenfoxacademy.week7day4.controllers;


import com.greenfoxacademy.week7day4.models.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsefulUtilitiesController {


    private UtilityService utilityService;

    @Autowired
    public UsefulUtilitiesController(UtilityService utilityService){
        this.utilityService = utilityService;
    }


    @GetMapping("/useful")
    public String usefulMainpage (){
        return "index";
    }

    @GetMapping("/useful/colored")
    public String randomColorPage(Model model){
        model.addAttribute("randomcolor", utilityService.randomColor());
        return "randomcolor";
    }

}
