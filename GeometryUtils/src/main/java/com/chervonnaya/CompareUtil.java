package com.chervonnaya;

public class CompareUtil {
    public static int compareFiguresByArea(ComparableFigure f1, ComparableFigure f2) {
        return Double.compare(f1.getArea(), f2.getArea());
    }

    public static int compareFiguresByPerimeter(ComparableFigure f1, ComparableFigure f2) {
        return Double.compare(f1.getPerimeter(), f2.getPerimeter());
    }
}
