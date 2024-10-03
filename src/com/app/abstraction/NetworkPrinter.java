package com.app.abstraction;

public class NetworkPrinter implements Printer {
    @Override
    public void print(String message) {
        System.out.println("Sending message to network printer: " + message + " with speed: " + SPEED);
    }
}
