package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class FoxListService {

    private List<Fox> listOfFoxes;

    public FoxListService(){
        listOfFoxes = new ArrayList<>();
        listOfFoxes.add(new Fox("Karak", Arrays.asList("jump", "walk"), "meat", "water"));
        listOfFoxes.add(new Fox("Vuk", Arrays.asList("salto mortale", "murder", "eat shit"), "pizza", "soda"));
        listOfFoxes.add(new Fox("Red", Arrays.asList("harvest jam on a lake", "kill elephants with its gaze"), "bread", "cola"));
    }



}