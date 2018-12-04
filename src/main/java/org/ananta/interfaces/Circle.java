package org.ananta.interfaces;

public class Circle implements Figure{
    private int radius;
    private Point center;

    public Circle(int radius, Point center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void draw(Paint paint) {
        System.out.print("круг радиуса "+ radius+" в точке "+center+" , ");
        paint.paintLine(center, center);
    }
}
