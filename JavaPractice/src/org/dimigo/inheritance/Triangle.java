package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/24/15.
 */
public class Triangle extends Figure {
    private final String name = "삼각형";
    private int width, height;

    public Triangle(int width, int height) {
        this(0, 0, width, height);
    }

    public Triangle(int centerX, int centerY, int width, int height) {
        super(centerX, centerY);
        this.width = width;
        this.height = height;
    }

    @Override
    protected double calcArea() {
        return width * height / 2;
    }

    @Override
    protected void printCenter() {
        System.out.print(name + " ");
        super.printCenter();
    }
}
