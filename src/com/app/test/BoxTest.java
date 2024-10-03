package com.app.test;

import com.app.core.Box;

import java.util.Scanner;

public class BoxTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Box b1 = new Box(10, 12, 8);

        Box b2 = b1.getBoxOffset(2, -3, 1);
        System.out.println(b1.getBoxDimension());
        System.out.println(b2.getBoxDimension());


//        Box b1 = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
//        System.out.println("b1 = " + b1.getBoxDimension());
//        System.out.println(b1.getBoxVolume());
//
//        System.out.println("Enter 2nd box (w h d): ");
//        Box b2 = new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
//        System.out.println("b2 = " + b2.getBoxDimension());
//        System.out.println(b2);
//
//        System.out.println(b1.isEqual(b2) ? "Same" : "Different");

    }
}
