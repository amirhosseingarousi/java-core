package day02;

public class Box {

    // Instance variables
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public String getBoxDetails() {
        return "Box Dimension: [ width: " + width + ", Height: " + height + ", Depth: " + depth + " ]";
    }

    public double getBoxVolume() {
        return width * height * depth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
}
