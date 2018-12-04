package org.ananta.interfaces;

public class Triangle implements Figure{
    private Point p1;
    private Point p2;
    private Point p3;

    public Triangle(Point p1, Point p2, Point p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    @Override
    public void draw(Paint paint) {
        System.out.println("треугольник " +p1 +" "+p2+" "+p3+" ");
//        paint.paintLine(p1, p2);
//        paint.paintLine(p2, p3);
//        paint.paintLine(p3, p1);

        paint.paintTriangle(p1, p2, p3);
    }



}
