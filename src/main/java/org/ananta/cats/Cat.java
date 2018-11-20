package org.ananta.cats;

public class Cat extends Animal{
    private boolean toksoplazmos;

    public Cat(boolean toksoplazmos) {
        this.toksoplazmos = toksoplazmos;
    }

    public Cat(int age, float pushistost, boolean toksoplazmos) {
        super(age, pushistost);
        this.toksoplazmos = toksoplazmos;
    }

    public Cat(int age, boolean toksoplazmos) {
        super(age);
        this.toksoplazmos = toksoplazmos;
    }



    public Cat(int age, float pushistost, String name, String poroda, boolean toksoplazmos) {
        super(age, pushistost, name, poroda);
        this.toksoplazmos = toksoplazmos;
    }

    public void runaway(){
        System.out.println("Палундра, убегаю!!!");
    }


    public boolean isToksoplazmos() {
        return toksoplazmos;
    }

    public void setToksoplazmos(boolean toksoplazmos) {
        this.toksoplazmos = toksoplazmos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Cat cat = (Cat) o;

        return toksoplazmos == cat.isToksoplazmos();
    }

}

