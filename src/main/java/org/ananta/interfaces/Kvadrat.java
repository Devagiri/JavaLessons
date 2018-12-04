package org.ananta.interfaces;

public class Kvadrat extends Pryamougolnik {

    public Kvadrat(Point p1, int sizeSide) {
        super(p1,
                p1.addPoint(new Point(sizeSide,0)),
                p1.addPoint(new Point(0,sizeSide)),
                p1.addPoint(new Point(sizeSide,sizeSide)));
    }

    @Override
    public void draw(Paint pain) {
        System.out.println("квадрат через прямоугольник");
        super.draw(pain);
    }

    @Override
    public void printHey() {
        System.out.println("hey от квадрата!");
    }
}
