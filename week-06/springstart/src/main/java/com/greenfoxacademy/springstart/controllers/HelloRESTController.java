package com.greenfoxacademy.springstart.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController

public class HelloRESTController {

    private static AtomicLong counter = new AtomicLong(1);

    @RequestMapping(value="/greeting")
    @ResponseBody
    public static Greetings greeting(@RequestParam ("name") String content){
        Greetings newGreeting = new Greetings(counter.getAndIncrement(), "Hello, " + content);
        return newGreeting;
    }
}