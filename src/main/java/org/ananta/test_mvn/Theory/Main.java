package org.ananta.test_mvn.Theory;

public class Main {
    public static void main(String[] args) {

//        Animal animal = new Animal();
//        FlyAnimal flyAnimal = new FlyAnimal();
//        NoFlyAnimal noFlyAnimal = new NoFlyAnimal();
//
//        if( noFlyAnimal instanceof Animal) System.out.println("Да");
//        else System.out.println("Нет");
//
//        animal = noFlyAnimal;
//

        Animal duck = new Animal("Утка", 10);
        Animal dog = new Animal("Собака", 20);

        System.out.println(duck.getName());
        System.out.println(dog.getName());

        dog.setAge(30);
        dog.printInfo();


        Animal animal = Animal.create("Кот",2);
        Singleton singleton = Singleton.getInstance();

    }
}


class Animal{
    private String name;
    private int age;

    private static int counter = 0;


    public static int getCounter(){
        return counter;
    }


    public static Animal create(String name, int age){
        return new Animal(name,age);
    }

    public Animal() {
       this(1);
    }

    public Animal(int age) {
       this("Животное", age);
    }


    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        counter++;
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    void printInfo(){
        System.out.println(getNameInfo()+" : "+getAgeInfoInfo()+" Count="+counter);
    }

    private String getNameInfo(){
      return "Name = "+getName();
    }

    private String getAgeInfoInfo(){
        return "Age = "+getAge();
    }
}


//
//class FlyAnimal extends Animal{
//
//}
//
//class NoFlyAnimal extends Animal{
//
//}