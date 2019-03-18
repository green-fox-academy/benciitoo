package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.models.Greeted;
import com.greenfoxacademy.frontend.models.UserInput;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainRestController {

    @GetMapping(value = "/doubling")
    public Object doubling (@RequestParam(value = "input", required = false) Integer input){

        if (input != null) {
            return new UserInput(input);
        } else {
            Error error = new Error();
            error.setErrorForDoubling();
            return error;
        }
    }


    @GetMapping(value = "/greeter")
    public Object greeter (@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title){
        Error error = new Error();
        if (name != null && title !=null){
            Greeted greeted = new Greeted();
            greeted.setGreeterMessage(name, title);
            return greeted;
        } else if (name != null && title == null) {
            error.setErrorForGreeterTitleMissing();
            return error;
        } else if (name == null && title != null) {
            error.setErrorForGreeterNameMissing();
            return error;
        } else {
            error.setErrorForGreeterNameAndTitleMissing();
            return error;
        }
    }




}