package com.greenfoxacademy.frontend.models;

public class DoUntil {

    private int result;

    public void calculate (String action, Until until){
        result = until.getUntil();
        
        if (action.equals("sum")){
            for (int i = 1; i < until.getUntil(); i++) {
                result += i;
            }
        } else if (action.equals("factor")) {
            for (int i = 1; i < until.getUntil(); i++) {
                result *= i;
            }
        }
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }
}