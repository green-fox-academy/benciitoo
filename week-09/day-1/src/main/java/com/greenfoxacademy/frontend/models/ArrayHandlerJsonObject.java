package com.greenfoxacademy.frontend.models;

import java.util.ArrayList;
import java.util.List;

public class ArrayHandlerJsonObject {

private String what;
private List<Integer> numbers = new ArrayList<>();

    public ArrayHandlerJsonObject() {
    }


    public String getWhat() {
        return what;
    }

    public void setWhat(String what) {
        this.what = what;
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }
}
