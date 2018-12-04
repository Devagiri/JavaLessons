package org.ananta.interfaces;

public class ExtendedPaint implements Paint {
    @Override
    public void paintLine(Point p1, Point p2) {
        System.out.println("расширенный движек рисования,  рисум линию");
    }

    @Override
    public void paintTriangle(Point p1, Point p2, Point p3) {
        System.out.println("расширенный движек рисования,  рисум треугольник");
    }
}
