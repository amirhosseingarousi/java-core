package com.app.abstraction;

public class FilePrinter implements Printer {
    private static final int SPEED = 60;

    @Override
    public void print(String message) {
        System.out.println("Saving message: " + message + " in file, with speed: " + SPEED);
    }

    public void close() {
        System.out.println("closing file...");
    }
}
