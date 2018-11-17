package org.ananta.cats;

public class Cat {
    private int age;
    private float pushistost;
    private String name;
    private String poroda;

    public Cat() {
        this(1, 0.5F, "Jane", "Doe");
    }

    public Cat(int age, float pushistost) {
        this(age, pushistost, "Jane", "Doe");
    }

    public Cat(int age) {
        this(age, 0.5F);
    }

    public Cat(int age, float pushistost, String name, String poroda) {
        this.age = age;
        this.pushistost = pushistost;
        this.name = name;
        this.poroda = poroda;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0) age = 0;
        this.age = age;
    }

    public float getPushistost() {
        return pushistost;
    }

    public void setPushistost(float pushistost) {
        this.pushistost = pushistost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return String.format("Порода %s Имя %s Возраст %d Пушистость %f", this.poroda, this.name, this.age, this.pushistost );

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cat cat = (Cat) o;

        if (age != cat.age) return false;
        if (Float.compare(cat.pushistost, pushistost) != 0) return false;
        if (!name.equals(cat.name)) return false;
        return poroda.equals(cat.poroda);
    }


}

