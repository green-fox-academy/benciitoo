package com.greenfoxacademy.hundredmilepagony.Model;

public class Inhabitant {

    private static int nextId = 0;

    private int id;
    private  String name;
    private Integer age;
    private Gender gender;



    public Inhabitant( String name, Integer age, Gender gender) {
        this.id = nextId++;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }
}
