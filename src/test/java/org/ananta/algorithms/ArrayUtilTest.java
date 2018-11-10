package org.ananta.algorithms;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ArrayUtilTest {

    @Test
    public void testIsEqual_whenArraysAreEqual() {
        int[] source = {1, 2, 3, 4};
        int[] target = {1, 2, 3, 4};

        boolean result = ArrayUtil.isEqual(source, target);

        Assert.assertTrue(result);
    }

    @Test
    public void testIsEqual_whenArraysWithDifferentLength() {
        int[] source = {1, 2, 3, 4, 5};
        int[] target = {1, 2, 3, 4};

        boolean result = ArrayUtil.isEqual(source, target);

        Assert.assertFalse(result);
    }

    @Test
    public void testIsEqual_whenArraysAreDifferent() {
        int[] source = {1, 3, 5, 10};
        int[] target = {1, 2, 3, 4};

        boolean result = ArrayUtil.isEqual(source, target);

        Assert.assertFalse(result);
    }
}
