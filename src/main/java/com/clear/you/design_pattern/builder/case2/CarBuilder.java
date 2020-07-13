package com.clear.you.design_pattern.builder.case2;

import com.clear.you.design_pattern.builder.CarModel;

import java.util.ArrayList;

public class CarBuilder {

    private ArrayList<String> sequence;

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    public static <T extends CarModel> T getCarModel(Class<T> c) {
        CarModel carModel=null;
        try {
            carModel=(T)Class.forName(c.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return(T)carModel;
    }

}
