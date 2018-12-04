package org.ananta.interfaces;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public static Point addPoint(Point point1, Point point2){
        return new Point(point1.getX()+point2.getX(), point1.getY()+point2.getY());
    }

    public Point addPoint(Point point){
        return Point.addPoint(this , point);
    }

    public Point addPointMutable(Point point){
        x+=point.getX();
        y+=point.getY();
        return this;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        StringBuilder str=new StringBuilder();

        str.append("x=")
           .append(x)
           .append(" y=")
           .append(y);

        return str.toString();
    }
}
