package org.ananta.collections;

import java.util.*;
import java.util.function.Consumer;


class Data{
    private int age;
    private String name;

    public Data(int age, String name) {
        this.age = age;
        this.name = name;
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Data data = (Data) o;

        if (age != data.age) return false;
        return name != null ? name.equals(data.name) : data.name == null;
    }

    @Override
    public int hashCode() {
        int result = age;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Data{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}



public class CollectionsLesson {

    static  String name="";
    public static void main(String[] args) {


        Map<String,String> map = new HashMap<>();
        map.put("a1","строка1");
        map.put("a2","строка2");
        map.put("a3","строка3");
        map.putIfAbsent("a3","dasdasd");

        System.out.println("по ключу a1 "+map.get("a1")+"\n");

        for (Map.Entry<String, String> entry : map.entrySet()) {
            //entry.setValue("___");
            System.out.println("ключ "+entry.getKey()+" значение "+entry.getValue());
        }

        for (String value : map.values()) {
            System.out.println(value);
        }


//        for (Map.Entry<String, String> entry : map.entrySet()) {
//            if(entry.getKey().equals("a2")) map.remove("a2");
//        }

        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();

        Map.Entry<String, String> next;

        while (it.hasNext()){
            next = it.next();
            if(next.getKey().equals("a2")) it.remove();
        }


        for (String value : map.values()) {
            System.out.println(value);
        }

        Data key = new Data(10, "John");

        HashMap<Data, String> dataMap = new HashMap<>();
        dataMap.put(key, "value");

        dataMap.get(key);

        List emptyList = Collections.EMPTY_LIST;

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
        Collections.shuffle(list);
        list.forEach(System.out::println);

        System.out.println("\n\n");
        Collections.sort(list, (v1, v2) -> -Integer.compare(v1,v2));
        //Collections.sort(list);
        list.forEach(System.out::println);


        List<Data> listData = Arrays.asList(new Data(10,"1"),new Data(20,"2")
                ,new Data(30,"3"));
        Collections.shuffle(listData);
        listData.forEach(System.out::println);

        System.out.println("\n\n");
        Collections.sort(listData, (v1, v2) -> -Integer.compare(v1.getAge(),v2.getAge()));
        //Collections.sort(list);
        listData.forEach(System.out::println);



        //////////////////////////

        list.forEach(new Consumer<Integer>() {
            @Override
            public void accept(Integer v) {
                System.out.println(v);
            }
        });

        list.forEach(System.out::println);


        String prefix = "__";

        list.forEach(x -> {
            CollectionsLesson.name = "ddddd";
            System.out.println(prefix+x);
        });

    }

    private int age=10;
    public void action(){
        int ttt = 0;
        Collections.EMPTY_LIST.forEach(x -> {
           // ttt=10;
            age=20;
        });
    }
}
