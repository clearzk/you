package com.clear.you.design_pattern.builder.case2;

import com.clear.you.design_pattern.builder.BMWModel;
import com.clear.you.design_pattern.builder.BenzModel;
import com.clear.you.design_pattern.builder.Constants;

import java.util.ArrayList;

public class Client2 {
    public static void main(String[] args) {

        ArrayList<String> sequence=new ArrayList<>(4);
        sequence.add(Constants.ENGINE_BOOM);
        sequence.add(Constants.START);
        sequence.add(Constants.STOP);

        BenzModel benzModel = CarBuilder.getCarModel(BenzModel.class);
        benzModel.setSequence(sequence);
        benzModel.run();
        System.out.println("--------------------");
        BMWModel bmwModel = CarBuilder.getCarModel(BMWModel.class);
        bmwModel.setSequence(sequence);
        bmwModel.run();


    }
}
