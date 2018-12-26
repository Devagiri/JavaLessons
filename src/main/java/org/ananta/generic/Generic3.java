package org.ananta.generic;

import org.ananta.genericList.IList;
import org.ananta.genericList.MyList;

import java.util.*;

public class Generic3<T extends Number> {
    public static void main(String[] args) {
        Generic3<Integer> g = new Generic3<>();
        g.myFunc(2.0);
        g.listOp(new MyList<>(new Float[]{1F,2F,3F}));


        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.forEach(v -> System.out.println(v));


        Set<Integer> set = new HashSet<>();
        set.add(500);
        set.add(2);
        set.add(1000);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        set = new LinkedHashSet<>();
        set.add(500);
        set.add(2);
        set.add(1000);
        iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }

    public <T extends Number>  T myFunc(T value){
        return value;
    }

    public void listOp(IList<? extends Number> list){}


}
