package com.greenfoxacademy.frontend.services;

import com.greenfoxacademy.frontend.models.Append;
import com.greenfoxacademy.frontend.models.DoUntil;
import com.greenfoxacademy.frontend.models.Until;
import org.springframework.stereotype.Service;

@Service
public class MainService {

    public DoUntil doUntilCalculation(String action, Until until){
        DoUntil doUntil = new DoUntil();
        doUntil.calculate(action, until);
        return doUntil;
    }


    public Append appending(String appendable){
        Append append = new Append();
        append.setAppended(appendable);
        return append;
    }

}