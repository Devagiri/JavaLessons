package org.ananta.test_mvn.Theory;

class Singleton{
    private Singleton() {
    }

    private static Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }



}
