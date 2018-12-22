package org.ananta.generic;

public class Generic<T> implements IGeneric<T> {
    public final T value;

    public Generic(T value) {
        this.value = value;

    }


    @Override
    public T getValue() {
        return value;
    }

    public static void main(String[] args) {
        Generic<Integer> intValue = new Generic<>(10);
        Generic<Float> floatValue = new Generic<>(10F);
        Generic<String> stringValue = new Generic<>("строка");



        IGeneric[] list = new IGeneric[3];
        list[0] = intValue;
        list[1] = floatValue;
        list[2] = stringValue;

        for (IGeneric item : list) {

            System.out.println(item.getValue());

        }


    }
}
