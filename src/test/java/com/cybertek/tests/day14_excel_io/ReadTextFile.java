package com.cybertek.tests.day14_excel_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadTextFile {

    public static void main(String[] args) throws FileNotFoundException {
        String path = "shopping_list.txt";
        File file = new File(path);

        System.out.println(file.exists());
        System.out.println(file.isFile());


        Scanner scanner = new Scanner(file);

        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }


}
