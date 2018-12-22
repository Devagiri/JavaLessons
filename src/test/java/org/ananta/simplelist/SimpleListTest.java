package org.ananta.simplelist;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SimpleListTest {

    @Test
    public void testSize() {
    }

    @Test
    public void testAdd() {
    }

    @Test
    public void testAddAll() {
    }

    @Test
    public void testGet() {
        SimpleList list = new SimpleList(new Object[]{1,3,3,3,5});
        Assert.assertEquals(list.findLast(3),3);


        list = new SimpleList(new Object[]{1,1,2,3,5});
        Assert.assertEquals(list.findLast(3),3);


    }

    @Test
    public void testPush() {
    }

    @Test
    public void testPeek() {
    }

    @Test
    public void testPop() {
    }

    @Test
    public void testToArray() {
    }

    @Test
    public void testAddAll1() {
    }

    @Test
    public void testRemove() {
    }

    @Test
    public void testFindAll() {
    }

    @Test
    public void testFindFirst() {
    }

    @Test
    public void testFindLast() {
    }

    @Test
    public void testToString() {
    }
}