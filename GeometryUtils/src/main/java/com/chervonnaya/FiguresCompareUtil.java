package com.chervonnaya;

public class FiguresCompareUtil {
    public static int compareCirclesByArea(ComparableFigures f1, ComparableFigures f2) {
        return Double.compare(f1.getArea(), f2.getArea());
    }

    public static int compareCirclesByPerimeter(ComparableFigures f1, ComparableFigures f2) {
        return Double.compare(f1.getPerimeter(), f2.getPerimeter());
    }
}
