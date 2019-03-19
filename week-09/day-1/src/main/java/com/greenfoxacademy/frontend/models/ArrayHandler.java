package com.greenfoxacademy.frontend.models;

import java.util.List;

public class ArrayHandler {

    private Object result;

    public ArrayHandler() {
    }


    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    public void calculate (ArrayHandlerJsonObject arrayHandlerJsonObject) {
        result = 0;
        List<Integer> templist = arrayHandlerJsonObject.getNumbers();
        String action = arrayHandlerJsonObject.getWhat();

        if (action.equals("sum")) {
            int tempresult = 0;
            for (int i = 0; i < templist.size(); i++) {
                tempresult += templist.get(i);
            }
            result = tempresult;
        } else if (action.equals("multiply")) {
            int tempresult = 1;
            for (int i = 1; i < templist.size(); i++) {
                tempresult = tempresult * templist.get(i);
            }
            result = tempresult;
        } else if (action.equals("double")){
            for (int i = 0; i < templist.size(); i++) {
                templist.set(i, templist.get(i) * 2);
            }
            result = templist;
        }
    }
}