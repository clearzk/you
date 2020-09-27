package com.clear.you.design_pattern.strategy.best_practice;

public class Client {

    public static void main(String[] args) {
        int a=5,b=3;
        int add = Calculator.ADD.exec(a, b);
        int sub = Calculator.SUB.exec(a, b);
        System.out.println(add);
        System.out.println(sub);
    }

}
