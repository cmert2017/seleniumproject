package com.cybertek.tests.day10_testbase_properties_driverutil;

import com.cybertek.utilities.ConfigurationReader;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_from_properties_file() throws IOException {

        // Properties: Use
        Properties properties = new Properties();

        //FileInputStream: opens the file
        String path = "configuration.properties";

        FileInputStream file = new FileInputStream(path);


        //we will load the file
        properties.load(file);

        //we read from the file
        System.out.println("properties.getProperty(\"browser\") = " + properties.getProperty("browser"));
        System.out.println("properties.getProperty(\"username\") = " + properties.getProperty("username"));


        //close the file
        file.close();
    }

    @Test
    public void using_properties_utility_method(){

        ConfigurationReader.getProperty("browser");

    }


}
