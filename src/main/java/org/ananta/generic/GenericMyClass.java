package org.ananta.generic;



public class GenericMyClass<T extends MyClass> implements IGeneric<T> {
    public final T value;

    public GenericMyClass(T value) {
        this.value = value;

    }


    @Override
    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        GenericMyClass<MyClass> myClass = new GenericMyClass<MyClass>(new MyClass());
        GenericMyClass<MyClass2> myClass2 = new GenericMyClass<MyClass2>(new MyClass2());
        //GenericMyClass<Object> myClass3 = new GenericMyClass<Object>(new Object());

    }
}


 class MyClass{

}

class MyClass2 extends MyClass{

}