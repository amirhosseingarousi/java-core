package session01;

import java.util.Scanner;

class HelloWorld {

    public static void main(String[] args) {
        System.out.println("Welcome to Java 21.");
        System.out.println("sum = " + sum(args));
        System.out.println(args[0] + args[1]);

        System.out.printf("Result = %.3f", multiply());

    }

    private static int sum(String[] args) {
        return Integer.parseInt(args[0]) + Integer.parseInt(args[1]);
    }

    private static int testScanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 2 number for multiplication: ");
        return scanner.nextInt() * scanner.nextInt();
    }

    private static double multiply() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter two number: ");
        return scanner.nextDouble() * scanner.nextDouble();
    }
}
