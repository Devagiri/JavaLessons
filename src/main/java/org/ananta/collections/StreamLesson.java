package org.ananta.collections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamLesson {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.stream();

        Stream.of(1,2,3,4)
                .map(v->v*2)
                .forEach(System.out::println);
        System.out.println("\n");

        Arrays.stream(new int[]{1,2,3,4,5})
                .map(v->v*2)
                .forEach(System.out::println);
        System.out.println("\n");


        Arrays.stream(new int[]{1,2,3,4,5})
                .filter(v->v<3)
                .map(v->v*2)
                .forEach(System.out::println);
        System.out.println("\n");

        Stream.<Integer>builder().add(1).add(2).add(3).build()
                .map(v->v*2)
                .forEach(System.out::println);

        System.out.println("\n");


        Stream.iterate(0, v->v+1)
                .limit(10)
                .map(v->v*2)
                .forEach(System.out::println);

        System.out.println("\n");

        Stream.iterate(0, v->v+1)
                .takeWhile(v->v<10)
                .map(v->v*2)
                .forEach(System.out::println);

        System.out.println("\n");


        Stream.iterate(0, v->v+1)
                .dropWhile(v->v<10)
                .map(v->v*2)
                .limit(10)
                .forEach(System.out::println);




        Stream.of(1,2,3,4,1,2,7,8)
                .skip(2)
                .map(v->v*2)
                .filter(v->v<10)
                .distinct()
                .peek(v-> System.out.println(v))
                .sorted((v1, v2) -> Integer.compare(v1,v2))
                .mapToInt(v->v).sum();

        System.out.println("\n");


        Stream.of(1,2,3,4,1,2,7,8)
                .skip(2)
                .map(v->v*2)
                .filter(v->v<10)
                .distinct()
                .peek(v-> System.out.println(v))
                .sorted((v1, v2) -> Integer.compare(v1,v2))
                .mapToInt(v->v-1)
                .mapToObj(v->v*3)
                .flatMap(v->Stream.of(1,2,3,4,5,6))
                //.count()
                .forEach(System.out::println);

        System.out.println("\n");
        System.out.println("\n");

        List<List<Integer>> listList = new ArrayList<>();
        listList.add(List.of(1,2,3,4,5));
        listList.add(List.of(6,7));
        listList.add(List.of(8,9));
        int sum = listList.stream()
                .flatMap(v -> v.stream())
                .mapToInt(v -> v).sum();
        //.forEach(System.out::println);
        System.out.println(sum);

        Integer summ2 = listList.stream()
                .flatMap(v -> v.stream())
                .reduce(0,(acc, v) -> acc += v);

        System.out.println(summ2);


        Optional<Integer> first = Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
                .map(v -> v * 2)
                .filter(v -> v < 10)
                .findFirst();


        Optional<Integer> any = Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
                .map(v -> v * 2)
                .filter(v -> v < 10)
                .findAny();


        boolean b = Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
                .map(v -> v * 2)
                .filter(v -> v < 10)
                .allMatch(v -> v > 0);

        boolean b2 = Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
                .map(v -> v * 2)
                .filter(v -> v < 10)
                .noneMatch(v -> v < 0);



//        Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
//                .map(v -> v * 2)
//                .filter(v -> v < 10)
//                .min()
//                .max()


        String collect = Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
                .map(v -> v * 2)
                .filter(v -> v < 10)
                .map(String::valueOf)
                .collect(Collectors.joining("-"));


        Stream.of(1, 2, 3, 4, 1, 2, 7, 8)
                .map(v -> v * 2)
                .filter(v -> v < 10)
                .map(String::valueOf)
                .collect(Collectors.toList());

//        Map<Boolean, Integer> collect1 = Stream.of(1, 2, 3, 4)
//
//                .collect(Collectors.toMap(v -> v > 2, Function.identity()));
//
//        System.out.println("\n");


        Map<Boolean, List<Integer>> collect1 = Stream.of(1, 2, 3, 4)
                .collect(Collectors.groupingBy(v -> v > 2));

        System.out.println("\n");
    }



}
