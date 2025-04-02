package day02;

import java.util.Objects;

public class Box {

    // Instance variables
    private double width;
    private double height;
    private double depth;
    private String color;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box(double width) {
        this(width, width, width);
    }

    public String getColor(Box box) {
        if (this.getBoxVolume() < box.getBoxVolume())
            this.color = "RED";
        else if (this.getBoxVolume() == box.getBoxVolume()) {
            this.color = "WHITE";
        }
        else this.color = "GREEN";
        return color;
    }

    public String getBoxDetails() {
        return "Box Dimension: [ width: " + width + ", Height: " + height + ", Depth: " + depth + " ]";
    }

    public String getBoxInfo() {
        StringBuilder sb = new StringBuilder();
        return sb.append("width = ").append(width)
                .append(", Height = ").append(height)
                .append(", Depth = ").append(depth)
                .toString();
    }

    public double getBoxVolume() {
        return width * height * depth;
    }

    public Box updatedBox(double offsetWidth, double offsetHeight, double offsetDepth) {
        return new Box(width + offsetWidth, height + offsetHeight, depth + offsetDepth);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Double.compare(width, box.width) == 0 && Double.compare(height, box.height) == 0 && Double.compare(depth, box.depth) == 0;
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
