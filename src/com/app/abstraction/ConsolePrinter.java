package com.app.abstraction;

public class ConsolePrinter implements Printer {
    private static final int SPEED = 100;

    @Override
    public void print(String message) {
        System.out.println("Printing message: " + message + " on the console, with speed: " + SPEED);
    }
}
