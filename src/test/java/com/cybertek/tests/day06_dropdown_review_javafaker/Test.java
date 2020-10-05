package com.cybertek.tests.day06_dropdown_review_javafaker;

public class Test {
    public static void main(String[] args) {

        String name = " cyber[tek]";
        //name.replaceAll("[a-z]", "");
        name = name.replace("[", "");
        System.out.println(name);
    }
}
