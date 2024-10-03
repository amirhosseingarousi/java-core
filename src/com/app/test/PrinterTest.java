package com.app.test;

import com.app.abstraction.ConsolePrinter;
import com.app.abstraction.FilePrinter;
import com.app.abstraction.NetworkPrinter;
import com.app.abstraction.Printer;

public class PrinterTest {
    public static void main(String[] args) {

        Printer[] printers = {new FilePrinter(), new ConsolePrinter(), new NetworkPrinter()};   // upcasting
        for(Printer printer : printers) {
            printer.print("some mesg!!!");  // runtime polymorphism
            if(printer instanceof FilePrinter) {    // no ClassCastException
                ((FilePrinter) printer).close();    // no javac err -> down casting
            } else if (printer instanceof NetworkPrinter) {
                ((NetworkPrinter) printer).shutdown();
            }
        }

    }
}
