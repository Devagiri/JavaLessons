package org.ananta.test_mvn.practical_lesson1;

import org.ananta.cats.Cat;
import org.ananta.simplelist.IList;
import org.ananta.simplelist.SimpleList;

import java.util.ArrayList;
import java.util.List;

public class PracticalLesson1 {
    public static void main(String[] args) throws InterruptedException {


//       IntList data2 = new IntList();
//
//        System.out.println(data1);
//        System.out.println(data2);
//
//        data1.add(10);
//        data1.addAll(new int[]{7,15,3});
//        System.out.println(data1);
//        System.out.println(data1.pop());
//        System.out.println(data1);
//
//        System.out.println(data1.get(1));


//        Object obj = null;
//
//        IntList data1 = new IntList(new int[]{1,2,3,4,5,6,7});
//
//        obj=data1;
//
//        IntList list =  (IntList) obj;
//        list.add(3);
//        obj="asdasd";
//
//        System.out.println(obj);
//


        IList list = new SimpleList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add("привет");
        list.add(1.0);
        list.add(new Cat(true));

        try {
            list.get(20);
        }catch (Exception e){
            System.out.println("не верный индекс");
        }



        System.out.println(list);

        int sum=0;
        Object item;
        for (int i=0; i<list.size(); i++){

            item = list.get(i);

            if(item instanceof Integer){
                sum+=(int)item;
            }else if(item instanceof Double){
                sum+=(double)item;
            }else if(item instanceof String){
                sum+=((String)item).length();
            }else if(item instanceof Cat){
                sum+=((Cat)item).getAge();
            }
        }

        System.out.println(sum);


        List<Object> list2 = new ArrayList<Object>();

        list2.add(1);
        list2.add("asdas");
        list2.forEach(o -> System.out.println(o));



    }
}
