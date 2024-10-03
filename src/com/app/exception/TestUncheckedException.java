package com.app.exception;

public class TestUncheckedException {
    public static void main(String[] args) {

        int a = 100;
        int b = 0;
//        System.out.println(a / b); // ArithmeticException -> un-checked -> javac does not force to handle

        String[] names = {"John", "Max"};
//        System.out.println(names[2]); // ArrayIndexOutOfBoundsException -> un-checked

        String val = "12y";
//        double valDouble = Double.parseDouble(val); // NumberFormatException -> un-checked
    }
}
