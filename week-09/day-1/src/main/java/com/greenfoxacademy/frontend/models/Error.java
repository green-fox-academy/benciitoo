package com.greenfoxacademy.frontend.models;

public class Error {

    private String error;


    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public void setErrorForDoubling(){
        this.error = "Please provide an input!";
    }

    public void setErrorForGreeterTitleMissing(){
        this.error = "Please provide a title!";
    }

    public void setErrorForGreeterNameMissing(){
        this.error = "Please provide a name!";
    }

    public void setErrorForGreeterNameAndTitleMissing(){
        this.error = "Please provide a name and a title!";
    }



}