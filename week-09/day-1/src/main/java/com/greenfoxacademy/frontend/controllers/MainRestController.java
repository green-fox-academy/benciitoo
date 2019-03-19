package com.greenfoxacademy.frontend.controllers;

import com.greenfoxacademy.frontend.models.*;
import com.greenfoxacademy.frontend.models.Error;
import com.greenfoxacademy.frontend.services.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MainRestController {

    private MainService mainService;

    @Autowired
    public MainRestController(MainService mainService){
        this.mainService = mainService;
    }


    @GetMapping(value = "/doubling")
    public Object doubling(@RequestParam(value = "input", required = false) Integer input) {

        if (input != null) {
            return new UserInput(input);
        } else {
            Error error = new Error();
            error.setErrorForDoubling();
            return error;
        }
    }


    @GetMapping(value = "/greeter")
    public Object greeter(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "title", required = false) String title) {
        Error error = new Error();
        if (name != null && title != null) {
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


    @GetMapping(value = "/appenda/{appendable}")
    public Object appendA(@PathVariable(value = "appendable") String appendable) {
        return mainService.appending(appendable);
    }


    @PostMapping(value = "/dountil/{action}")
    public Object doUntil(@PathVariable(value = "action") String action, @RequestBody Until until) {

        if (until.getUntil() == null) {
            Error error = new Error();
            error.setErrorForDoUntil();
            return error;
        } else {
            return mainService.doUntilCalculation(action, until);
        }
    }


    @PostMapping(value = "/arrays")
    public Object arrays(@RequestBody ArrayHandlerJsonObject arrayHandlerJsonObject) {

        if (arrayHandlerJsonObject.getNumbers() == null | arrayHandlerJsonObject.getWhat() == null | arrayHandlerJsonObject == null) {
            Error error = new Error();
            error.setErrorForArrayHandler();
            return error;
        } else {
            ArrayHandler arrayHandler = new ArrayHandler();
            arrayHandler.calculate(arrayHandlerJsonObject);
            return arrayHandler;
        }
    }



}