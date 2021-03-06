package org.ananta.interfaces;

public class Pryamougolnik implements Figure {
    private Point p1;
    private Point p2;
    private Point p3;
    private Point p4;

    public Pryamougolnik(Point p1, Point p2, Point p3, Point p4) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
        this.p4 = p4;
    }

    @Override
    public void draw(Paint paint) {
        System.out.println("прямоугольник" +p1 +" "+p2+" "+p3+" "+p4+" ");
        paint.paintLine(p1, p2);
        paint.paintLine(p2, p3);
        paint.paintLine(p3, p4);
        paint.paintLine(p4, p1);
    }
}
