package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/17/15.
 */
public class Rectangle extends Figure {
    private final String name = "사각형";
    private int width, height;

    public Rectangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Rectangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calcArea() {
        return width * height;
    }

    @Override
    protected void printCenter() {
        System.out.print(name + " ");
        super.printCenter();
    }
}
