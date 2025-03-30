package day02;

public class ApplicationDay02 {
    public static void main(String[] args) {

        Box box = CreateBox.getBoxFromUser();
//        System.out.println(box.getBoxDetails());
//        System.out.println("Volume: " + box.getBoxVolume());

        Box box1 = box;
        System.out.println("box volume: " + box.getBoxVolume());
        System.out.println("box1 volume: " + box1.getBoxVolume());
    }

    private static void m2() {
        Box box = new Box(5, 3, 2);
        System.out.println(box.getBoxDetails());
        System.out.println(box.getBoxVolume());
        System.out.println(box.getBoxInfo());
    }

    private static void m() {
        byte b1 = 10;    // no javac error
        int data = b1;  // no error --auto promotion

//        float f1 = 23.45; -- javac error
        float f2 = 23.45F;
        double d1 = f2;
        long l1 = 456321;
        f2 = l1;

        long a1 = 2;
        long a2 = 6;
        long l3 = a1 + a2;
        float f3 = a1 + a2;

        long z1 = 3;
        double d2 = 2.2;
        double i = z1 + d2 + b1 + data;
    }

    /*
    byte & byte -> int
    byte & short -> int
    short & short -> int
    int & long -> long
    long & float -> float
    float & double -> double
    byte & short & int & double -> double
     */
}
