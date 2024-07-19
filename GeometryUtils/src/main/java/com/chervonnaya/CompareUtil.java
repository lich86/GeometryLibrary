package com.chervonnaya;

public class CompareUtil {
    public static int compareFiguresByArea(ComparableFigures f1, ComparableFigures f2) {
        return Double.compare(f1.getArea(), f2.getArea());
    }

    public static int compareFiguresByPerimeter(ComparableFigures f1, ComparableFigures f2) {
        return Double.compare(f1.getPerimeter(), f2.getPerimeter());
    }
}
