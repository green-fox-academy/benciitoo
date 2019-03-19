package com.greenfoxacademy.frontend.models;

public class Append {

    private String appended;

    public Append() {
    }

    public Append(String appended) {
        this.appended = appended;
    }

    public void setAppended(String appendThis){
        this.appended = appendThis + "a";
    }

    public String getAppended() {
        return appended;
    }
}