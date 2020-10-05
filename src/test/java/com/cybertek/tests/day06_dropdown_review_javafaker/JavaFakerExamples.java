package com.cybertek.tests.day06_dropdown_review_javafaker;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class JavaFakerExamples {


    @Test
    public void faker_test(){
        //we need to create an object from Faker class to be able to use methods.
        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        System.out.println("firstName = " + firstName);

        String lastNAme = faker.name().lastName();
        System.out.println("lastNAme = " + lastNAme);

        String fullName = faker.name().fullName();
        System.out.println("fullName = " + fullName);

        String address = faker.address().fullAddress();
        System.out.println("address = " + address);

        String fact = faker.chuckNorris().fact();
        System.out.println("fact = " + fact);
        String house = faker.gameOfThrones().house();
        System.out.println("house = " + house);

        String quote = faker.gameOfThrones().quote();
        System.out.println("quote = " + quote);

        String ancient = faker.ancient().god();
        System.out.println("ancient = " + ancient);


    }

}
