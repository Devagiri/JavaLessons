package org.ananta.interfaces;

public class Main {
    public static void main(String[] args) {

        Paint simplePaint = new SimplePaint();
        Paint extPaint = new ExtendedPaint();



        Figure [] figures = new Figure[]{
                new Kvadrat(new Point(1,2), 3),
                new Circle(2, new Point(2,3)),
                new Triangle(new Point(1,2),new Point(3,5),new Point(6,10))

        };

        for (Figure fig : figures) {
            fig.draw(simplePaint);
            fig.printHey();
        }

        System.out.println("\n\n----------------------------\n\n");
        for (Figure fig : figures) {
            fig.draw(extPaint);
            fig.printHey();
        }

    }
}
