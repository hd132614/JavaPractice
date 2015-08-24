package org.dimigo.inheritance;

/**
 * Created by HIPERCUBE on 8/24/15.
 */
public class FigureTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Triangle triangle = new Triangle(10, 10, 5, 8);
        Rectangle rectangle = new Rectangle(20, 20, 5, 8);

        System.out.printf("원의 넓이 : %.1f\n", circle.calcArea());
        System.out.printf("삼각형의 넓이 : %.1f\n", triangle.calcArea());
        System.out.printf("사각형의 넓이 : %.1f\n\n", rectangle.calcArea());

        circle.printCenter();
        triangle.printCenter();
        rectangle.printCenter();

        System.out.println("\n-- 중심좌표 이동 (x, y축 5씩)\n");
        circle.moveFigure(5, 5);
        triangle.moveFigure(5, 5);
        rectangle.moveFigure(5, 5);

        circle.printCenter();
        triangle.printCenter();
        rectangle.printCenter();
    }
}
