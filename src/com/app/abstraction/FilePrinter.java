package com.app.abstraction;

public class FilePrinter implements Printer {

    @Override
    public void print(String message) {
        System.out.println("Saving message: " + message + " in file, with speed: " + SPEED);
    }
}
