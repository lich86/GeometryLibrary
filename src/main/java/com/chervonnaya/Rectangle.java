package com.chervonnaya;


public record Rectangle(double height, double width) implements ComparableFigure {

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + height);
    }
}
