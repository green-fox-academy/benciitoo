package com.greenfoxacademy.week7day4.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class Printer {

    public void log(String message) {
        System.out.println("Time: " + LocalDateTime.now() + " MY PRINTER SAYS --- " + message);
    }
}