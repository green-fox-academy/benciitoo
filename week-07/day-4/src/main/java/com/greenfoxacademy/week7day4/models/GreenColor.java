package com.greenfoxacademy.week7day4.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("green")
public class GreenColor implements MyColor {

    private Printer colorPrinter;

    @Autowired
    public GreenColor(Printer colorPrinter){
        this.colorPrinter = colorPrinter;
    }

    @Override
    public void printColor() {
        this.colorPrinter.log("It is green in color...");
    }
}