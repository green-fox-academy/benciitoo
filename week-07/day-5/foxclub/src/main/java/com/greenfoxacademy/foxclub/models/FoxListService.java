package com.greenfoxacademy.foxclub.models;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FoxListService {

    private List<Fox> listOfFoxes;

    public FoxListService(){
        listOfFoxes = new ArrayList<>();
        listOfFoxes.add(new Fox("Karak", Arrays.asList("jump", "walk"), "meat", "water"));
        listOfFoxes.add(new Fox("Vuk", Arrays.asList("salto mortale", "murder", "eat shit"), "pizza", "soda"));
        listOfFoxes.add(new Fox("Red", Arrays.asList("harvest jam on a lake", "kill elephants with its gaze"), "bread", "cola"));
    }


    public List<Fox> getListOfFoxes() {
        return listOfFoxes;
    }

    public void setListOfFoxes(List<Fox> listOfFoxes) {
        this.listOfFoxes = listOfFoxes;
    }

    //Ez az optional része volt a Login page-nek, de ellentmond a logikával, ha továbbcsinálom a feladatot.
    public boolean isItIn(String name){
        boolean isItInAlready = true;
        if (listOfFoxes.stream().filter(x -> x.getName().equals(name)).collect(Collectors.toList()).size() == 0) {
            isItInAlready = false;
        }
        return isItInAlready;
    }

    public Fox getFox(String foxName){
        Fox selectedFox;
        selectedFox = listOfFoxes.stream()
                .filter(x -> x.getName().equalsIgnoreCase(foxName))
                .findFirst()
                .orElse(new Fox (foxName, Arrays.asList(), "", ""));
        return selectedFox;
    }


}