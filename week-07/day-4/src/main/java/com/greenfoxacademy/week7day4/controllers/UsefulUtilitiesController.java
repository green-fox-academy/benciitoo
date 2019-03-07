package com.greenfoxacademy.week7day4.controllers;


import com.greenfoxacademy.week7day4.models.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

    @GetMapping("/useful/email")
    public String emailPage(Model model, @RequestParam("email") String emailXX){
        model.addAttribute("isItValid", utilityService.validateEmail(emailXX));
        model.addAttribute("email", emailXX);
        return "emailvalid";
    }


    @GetMapping("/useful/encoding")
    public String encoding (Model model, @RequestParam("encodethis") String encodeThis, @RequestParam("codenumber") int number){
        model.addAttribute("encoded", utilityService.caesar(encodeThis, number));
        return "encodepage";
    }

    @GetMapping("/useful/decoding")
    public String decoding (Model model, @RequestParam("encodethis") String encodeThis, @RequestParam("codenumber") int number){
        model.addAttribute("encoded", utilityService.caesar(encodeThis, number));
        return "encodepage";
    }
}