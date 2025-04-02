package day02;

import java.util.Scanner;

public class ApplicationDay02 {
    public static void main(String[] args) {

        m8();
//        m7();
//        m6();
//        m5();
//        m4();
    }

    private static void m8() {
        Box box1 = new Box(4, 5, 6);
        Box box2 = new Box(6, 7, 8);
        System.out.println(box1.getColor(box2));
    }

    private static void m7() {
        Box box = new Box(10, 20, 30);
        Box updatedBox = box.updatedBox(5, -7, -4);

        System.out.println(box.getBoxDetails());
        System.out.println(updatedBox.getBoxDetails());
    }

    private static void m6() {
        Box box1 = new Box(4.0, 2.0, 1.0);
        Box box2 = new Box(4, 2, 1);
        if (box1.equals(box2))
            System.out.println("Same");
        else
            System.out.println("Different");
    }

    private static void m5() {
        Scanner scanner = new Scanner(System.in);
        Box box1 = CreateBox.getBoxFromUser();
        Box box2 = CreateBox.getBoxFromUser();
        if (box1.equals(box2))
            System.out.println("Two boxes are equals.");
        else
            System.out.println("Tow boxes are different");
    }

    private static void m4() {
        Box box = CreateBox.getCubeFromUser();
        System.out.println(box.getBoxDetails());
        System.out.println("Cube volume = " + box.getBoxVolume());
    }

    private static void m3() {
        Box box = CreateBox.getBoxFromUser();
        Box box1 = box;

        System.out.println("box volume: " + box.getBoxVolume());
        System.out.println("box1 volume: " + box1.getBoxVolume());
    }

    private static void m2() {
        Box box = new Box(5, 3, 2);
        System.out.println(box.getBoxDetails());
        System.out.println(box.getBoxVolume());
        System.out.println(box.getBoxInfo());
    }

    private static void m() {
        byte b1 = 10;    // no javac error
        int data = b1;  // no error --auto promotion

//        float f1 = 23.45; -- javac error
        float f2 = 23.45F;
        double d1 = f2;
        long l1 = 456321;
        f2 = l1;

        long a1 = 2;
        long a2 = 6;
        long l3 = a1 + a2;
        float f3 = a1 + a2;

        long z1 = 3;
        double d2 = 2.2;
        double i = z1 + d2 + b1 + data;
    }

    /*
    byte & byte -> int
    byte & short -> int
    short & short -> int
    int & long -> long
    long & float -> float
    float & double -> double
    byte & short & int & double -> double
     */
}
