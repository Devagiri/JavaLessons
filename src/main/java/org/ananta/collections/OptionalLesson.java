package org.ananta.collections;

import java.util.Optional;

public class OptionalLesson {
    public static void main(String[] args) {
        Optional<Object> empty = Optional.empty();

        int notNullVar = Optional.of(1).get();
        Optional<Object> nullVar = Optional.ofNullable(null);
        if(nullVar.isPresent()) System.out.println(nullVar.get());

        nullVar.ifPresent(o -> {
            System.out.println(o);
        });


        Optional<Integer>  intVar = Optional.ofNullable(null);
        System.out.println(nullVar.orElse(0));
        System.out.println( nullVar.orElseGet(() -> 0));

        intVar.orElseThrow();

        try {
            int varInt = intVar.orElseThrow(() -> new Exception("исключение"));
            System.out.println(varInt);
        } catch (Exception e) {
            e.printStackTrace();
        }


        System.out.println(intVar.map(value->value*2).orElse(0));

        System.out.println(intVar.flatMap(value->Optional.of(value*2)).orElse(0));

        int var1 = intVar
                .map(value->value*2)
                .filter(value->value>10)
                .orElse(0);

    }
}
