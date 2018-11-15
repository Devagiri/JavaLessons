package org.ananta;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OddEvenTest {

    @Test
    public void testNumberOfEven() {

        int arr[] = new int[]{18, 0, 7, 9, 10, 6, 0, 25};
        int countEven = OddEven.numberOfEven(arr);
        Assert.assertEquals(countEven, 3);

         arr = new int[]{0,0,0,0};
         countEven = OddEven.numberOfEven(arr);
        Assert.assertEquals(countEven, 0);


    }

    @Test
    public void testNumberOfZero() {

    }

    @Test
    public void testNumberOfOdd() {
    }
}