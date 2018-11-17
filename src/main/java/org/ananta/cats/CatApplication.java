package org.ananta.cats;

public class CatApplication {
    private static final int NUM_CATS = 100;

    public static void main(String[] args) {

        int countCats =0;
        Cat [] cats = new Cat[NUM_CATS];


        Cat cat;

        cat = new Cat(10, 0.1F, "Pers", "Barsik");
        cat.setAge(11);
        cats[countCats++] = cat;


        cats[countCats++] = new Cat(1, 0.3F, "Mursik", "HZ");
        cats[countCats++] = new Cat(3, 0.6F, "Jmurik", "Siam");
        cats[countCats++] = new Cat();
        cats[countCats++] = new Cat(3);
        cats[countCats++] = new Cat(5, 0.1F);


        for (int i=0; i<countCats; i++) System.out.println(cats[i].toString());

        Cat cat1 = new Cat(10, 0.1F, "Pers", "Barsik");
        Cat cat2 = new Cat(10, 0.1F, "Pers", "Barsik");

        if(cat1.equals(cat2) == true) System.out.println("Одинаковые");
        else System.out.println("Разные");


         cat1 = new Cat(1, 0.1F, "Pers", "Barsik");
         cat2 = new Cat(10, 0.1F, "Pers", "Barsik");

        if(cat1.equals(cat2) == true) System.out.println("Одинаковые");
        else System.out.println("Разные");
    }
}
