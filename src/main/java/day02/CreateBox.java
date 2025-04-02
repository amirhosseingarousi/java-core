package day02;

import java.util.Scanner;

public class CreateBox {

    public static Box getCubeFromUser() {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("Enter side of a cube: ");
            return new Box(scanner.nextDouble());
        }
    }

    public static Box getBoxFromUser() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter Box dimensions: W H D ");
            return new Box(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble());
        }
    }
}
