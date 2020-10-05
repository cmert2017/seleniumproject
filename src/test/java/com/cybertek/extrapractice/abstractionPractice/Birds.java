package com.cybertek.extrapractice.abstractionPractice;

public abstract  class Birds extends Animal implements AirAnimals {


    @Override
    public  abstract void eat();


    @Override
    public void sleep() {

    }

    @Override
    public void fly() {
        System.out.println("Birds fly");

    }
}
