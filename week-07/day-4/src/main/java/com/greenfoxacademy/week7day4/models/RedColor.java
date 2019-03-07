package com.greenfoxacademy.week7day4.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("red")
public class RedColor implements MyColor {

    private Printer colorPrinter;

    @Autowired
    public RedColor(Printer colorPrinter){
        this.colorPrinter = colorPrinter;
    }

    @Override
    public void printColor() {
        this.colorPrinter.log("It is a red color");
    }
}