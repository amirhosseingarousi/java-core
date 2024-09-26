package com.app.test;

import com.app.core.Box;

import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1st box (w h d): ");
        Box b1 = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        System.out.println("b1 = " + b1.getBoxDimension());

    }
}
