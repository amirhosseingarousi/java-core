package com.app.abstraction;

public class NetworkPrinter implements Printer {
    private static final int SPEED = 80;
    @Override
    public void print(String message) {
        System.out.println("Sending message to network printer: " + message + ", with speed: " + SPEED);
    }

    public void shutdown() {
        System.out.println("close connection...");
    }
}
