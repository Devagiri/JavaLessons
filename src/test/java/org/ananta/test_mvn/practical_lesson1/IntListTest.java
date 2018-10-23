package org.ananta.test_mvn.practical_lesson1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntListTest {

    @Test
    public void testSize() {

        IntList list = new IntList();
        Assert.assertEquals(list.size(), 0);

        list = new IntList(10);
        Assert.assertEquals(list.size(), 0);

        list = new IntList(new int[]{1,2,3,4,5});
        Assert.assertEquals(list.size(), 5);

        list = new IntList(new IntList(new int[]{1,2,3}));
        Assert.assertEquals(list.size(), 3);

        list = new IntList(new int[5]);
        Assert.assertEquals(list.size(), 5);

    }

    @Test
    public void testAddGet() {

        IntList list = new IntList();

        list.add(5);
        Assert.assertEquals(list.size(), 1);
        Assert.assertEquals(list.get(0), 5);



    }

    @Test
    public void testAddAll()  {

        IntList list = new IntList();
        int [] array =   new int[]{1,2,3,4,5};
        list.addAll(array);
        Assert.assertEquals(list.size(), array.length);

        for(int i =0; i<array.length; i++){
            Assert.assertEquals(list.get(i), array[i]);
        }

    }

    @Test
    public void testRemove() throws Exception {
    }



    @Test
    public void testPush() throws Exception {
    }

    @Test
    public void testPeek() throws Exception {
    }

    @Test
    public void testPop() throws Exception {
        IntList list = new IntList(new int[]{1,2,3,4,5});

        Assert.assertEquals(list.pop(), 5);
        Assert.assertEquals(list.size(), 4);
    }
}