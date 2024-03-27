package com.citb408;
public class Box {

    double width;
    double height;
    double depth;

    public Box() {
    }

    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    void increaseDimensions(double increaseNumber)  {
        if (increaseNumber <= 0) {
            throw new IllegalArgumentException();
        }

    }

    @Override
    public String toString() {
        return "Box{" + "width=" + width + ", height=" + height + ", depth=" + depth + '}';
    }

}
