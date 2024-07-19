package com.chervonnaya;

public record Cube(double sideLength) implements Comparable3DFigure{

    @Override
    public double getVolume() {
        return Math.pow(sideLength, 3);
    }

    @Override
    public double getSurfaceArea() {
        return 6 * Math.pow(sideLength, 2);
    }
}
