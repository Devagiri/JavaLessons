package org.ananta.test_mvn.practical_lesson1;

public class PracticalLesson1 {
    public static void main(String[] args) throws InterruptedException {

       IntList data1 = new IntList(new int[]{1,2,3,4,5,6,7});
       IntList data2 = new IntList(new int[]{1,2,3,4,5,6,7});
       data2.add(5);
       data2.addAll(new int[]{45,44});

        System.out.println(data1.toString());
        System.out.println(data2.toString());

        if(data1.compare(data2)) System.out.println("Одинаковые");
        else System.out.println("Разные");
    }
}
