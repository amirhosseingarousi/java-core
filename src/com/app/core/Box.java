package com.app.core;

public class Box {
    private double width;
    private double height;
    private double depth;

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public Box getBoxOffset(double width, double height, double depth) {
        return new Box(this.width - width, this.height - height, this.depth - depth);
    }

    public boolean isEqual(Box box) {
        return this.width == box.width && this.height == box.height && this.depth == box.depth;
    }

    public String getBoxDimension() {
        return "[ width: " + width + ", height: " + height + ", depth: " + depth + " ]";
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
