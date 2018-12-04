package org.ananta.interfaces;

public interface Figure {
    void draw(Paint paint);
    default void printHey(){
        System.out.println("Hey");
    }
}
