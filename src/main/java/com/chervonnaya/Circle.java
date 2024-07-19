package com.chervonnaya;

public record Circle(double radius) implements ComparableFigures {

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
}
