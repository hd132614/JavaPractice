package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/17/15.
 */
public class Circle extends Figure {
    private final String name = "원";
    private int radius;

    public Circle(int radius) {
        this(0, 0, radius);
    }

    public Circle(int centerX, int centerY, int radius) {
        super(centerX, centerY);
        this.radius = radius;
    }

    @Override
    protected double calcArea() {
        return radius * radius * Math.PI;
    }

    @Override
    protected void printCenter() {
        System.out.print(name + " ");
        super.printCenter();
    }
}
