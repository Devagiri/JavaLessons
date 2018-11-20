package org.ananta.cats;

public class Dog extends Animal {

    public Dog() {
    }

    public Dog(int age, float pushistost) {
        super(age, pushistost);
    }

    public Dog(int age) {
        super(age);
    }

    public Dog(int age, float pushistost, String name, String poroda) {
        super(age, pushistost, name, poroda);
    }




    public void bark(){

        System.out.println("Гав гав");
    }

    public void catchCat(Cat cat){
        System.out.println("Ловлю кошку "+cat.getName());
        cat.runaway();
    }

}
