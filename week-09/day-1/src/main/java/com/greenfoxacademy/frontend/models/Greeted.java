package com.greenfoxacademy.frontend.models;

public class Greeted {

    private String welcome_message;

    public void setGreeterMessage(String name, String title){
        this.welcome_message = "Oh, hi there " + name + ", my dear " + title + "!";
    }

    public String getWelcome_message() {
        return welcome_message;
    }

    public void setWelcome_message(String welcome_message) {
        this.welcome_message = welcome_message;
    }
}