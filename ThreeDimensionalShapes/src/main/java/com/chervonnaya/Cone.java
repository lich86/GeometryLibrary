package com.chervonnaya;

public record Cone(double radius, double height) {

    public double getVolume() {
        return (1.0 / 3.0) * Math.PI * Math.pow(radius, 2) * height;
    }

    public double getSurfaceArea() {
        double slantHeight = Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
        double baseArea = Math.PI * Math.pow(radius, 2);
        double lateralSurfaceArea = Math.PI * radius * slantHeight;
        return baseArea + lateralSurfaceArea;
    }
}
