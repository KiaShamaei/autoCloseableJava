package org.example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AfterJava8 {
    public static void main(String[] args) {
        //instantiate class in argument part of try block
        try (Scanner scanner = new Scanner(new File("test.txt"))) {
            while (scanner.hasNext()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }
}
