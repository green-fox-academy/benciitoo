package com.greenfoxacademy.hundredmilepagony.Model;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InhabitantList {

    private List<Inhabitant> inhbaitantlist;

    public InhabitantList() {
        this.inhbaitantlist = new ArrayList<>();
        initialiseList();
    }

    public void initialiseList() {
        inhbaitantlist.add(new Inhabitant("Micimackó", 4, Gender.MALE));
        inhbaitantlist.add(new Inhabitant("Malacka", 3, Gender.FEMALE));
    }

    public List<Inhabitant> getInhbaitantlist() {
        return inhbaitantlist;
    }

    public Inhabitant getInhabitantFromId(int id) {
        for ( Inhabitant inhabitant : inhbaitantlist) {
            if(inhabitant.getId()== id){
                return inhabitant;
            }
        }
        return null;
    }

    public void addNewInahbaitant(Inhabitant inhabitant){
        inhbaitantlist.add(inhabitant);

    }

}
