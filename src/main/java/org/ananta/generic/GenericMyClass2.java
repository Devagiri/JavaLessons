package org.ananta.generic;



public class GenericMyClass2<T> implements IGeneric<T> {
    public final T value;

    public GenericMyClass2(T value) {
        this.value = value;

    }


    @Override
    public T getValue() {
        return value;
    }

    public static void main(String[] args) {

        //GenericMyClass<Object> myClass3 = new GenericMyClass<Object>(new Object());

    }


    interface IMyInterface{

    }
}



