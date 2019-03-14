package com.greenfoxacademy.demo.controllers;


import com.greenfoxacademy.demo.services.RedditService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping (value = "/reddit")
public class RedditController {

    private RedditService redditService;

    public RedditController (RedditService redditService){
        this.redditService = redditService;
    }


    @GetMapping (value = {"", "/"})
    public String mainpage(){

        return "index";
    }


}
