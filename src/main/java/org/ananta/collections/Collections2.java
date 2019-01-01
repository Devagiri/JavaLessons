package org.ananta.collections;

import java.util.List;
import java.util.stream.Collectors;

public class Collections2 {
    public static void main(String[] args) {

        List<Integer> list = List.of(1,2,3,5);
        list.stream()
                .map(v -> v*10)
                //.map(v->-v)
                .filter(v->v<20)
                .forEach(System.out::println );



        list = List.of(1,2,3,5);

        List<Integer> newList = list.stream()
                .map(v -> v * 10)
                .filter(v-> v < 20 )
                .collect(Collectors.toList());


    }
}
