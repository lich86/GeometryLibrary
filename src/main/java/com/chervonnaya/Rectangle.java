package com.chervonnaya;


public record Rectangle(double height, double width) {

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }
}
