package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController

public class HelloRESTController {


    @RequestMapping(value="/greeting")
    @ResponseBody
    public static Greetings greeting(){
        Greetings newGreeting = new Greetings(1, "Hello, World!");
        return newGreeting;
    }
}