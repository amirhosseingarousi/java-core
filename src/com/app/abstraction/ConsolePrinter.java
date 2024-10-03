package com.app.abstraction;

public class ConsolePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Printing message: " + message + " on the console with speed: " + SPEED);
    }
}
