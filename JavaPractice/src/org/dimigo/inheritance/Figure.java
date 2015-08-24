package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/17/15.
 */
public class Figure {
    private int centerX, centerY;

    public Figure(int centerX, int centerY) {
        this.centerX = centerX;
        this.centerY = centerY;
    }

    protected double calcArea() {
        return .0f;
    }

    protected void printCenter() {
        System.out.println("중심좌표 : (" + centerX + ", " + centerY + ")");
    }

    protected void moveFigure(int x, int y) {
        centerX += x;
        centerY += y;
    }
}
