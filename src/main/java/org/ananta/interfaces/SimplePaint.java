package org.ananta.interfaces;

public class SimplePaint implements Paint {
    @Override
    public void paintLine(Point p1, Point p2) {
        System.out.println("простой движек рисования, рисуем линию");
    }

    @Override
    public void paintTriangle(Point p1, Point p2, Point p3) {
        System.out.println("простой движек рисования,  рисум треугольник");
    }
}
