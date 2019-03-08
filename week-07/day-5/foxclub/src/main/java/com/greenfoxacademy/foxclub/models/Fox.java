package com.greenfoxacademy.foxclub.models;

import java.util.List;

public class Fox {

    private String name;
    private List<String> listOfTricks;
    private String food;
    private String drink;

    public Fox(String name, List<String> listOfTricks, String food, String drink) {
        this.name = name;
        this.listOfTricks = listOfTricks;
        this.food = food;
        this.drink = drink;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
