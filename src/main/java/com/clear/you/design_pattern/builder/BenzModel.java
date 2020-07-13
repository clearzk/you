package com.clear.you.design_pattern.builder;

public class BenzModel extends CarModel{
    @Override
    void start() {
        System.out.println("奔驰车跑起来是这个样子的...");
    }

    @Override
    void alarm() {
        System.out.println("奔驰车的喇叭声音是这个样子的...");
    }

    @Override
    void engineBoom() {
        System.out.println("奔驰车的引擎是这个声音的...");
    }

    @Override
    void stop() {
        System.out.println("奔驰车应该这样停车...");
    }
}
