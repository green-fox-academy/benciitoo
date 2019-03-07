package com.greenfoxacademy.week7day4;

import com.greenfoxacademy.week7day4.models.MyColor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class Week7day4Application implements CommandLineRunner {

    private MyColor myColor;


    @Autowired
    Week7day4Application(@Qualifier("green") MyColor myColor) {
        this.myColor = myColor;
    }


    public static void main(String[] args) {
        SpringApplication.run(Week7day4Application.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        this.myColor.printColor();    }
}