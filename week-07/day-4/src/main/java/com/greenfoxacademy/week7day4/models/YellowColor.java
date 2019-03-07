package com.greenfoxacademy.week7day4.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("yellow")
public class YellowColor implements MyColor {

    private Printer colorPrinter;

    @Autowired
    public YellowColor(Printer colorPrinter){
        this.colorPrinter = colorPrinter;
    }

    @Override
    public void printColor() {
        this.colorPrinter.log("It is yellow in color...");
    }
}