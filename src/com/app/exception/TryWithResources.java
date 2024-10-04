package com.app.exception;

import java.util.Scanner;

public class TryWithResources {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)){
            String val = scanner.nextLine();
            double num = Double.parseDouble(val);
            System.out.println("The number is: " + num);
        } catch (Exception e) {
            System.out.println("******  ERROR  *******");
            e.printStackTrace();
        }
        System.out.println("main over.");

    }
}
