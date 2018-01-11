package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 *
 * @author kgnedash
 * @version 1
 * @since 11.01.18
 */
public class TurnTest {
    @Test
    public void whenArrayLengthIsEven() {
        Turn a = new Turn();
        int[] array = {1, 2, 3, 4};
        int[] result = a.back(array);
        int[] exp = {4, 3, 2, 1};
        Assert.assertArrayEquals(exp, result);
    }
    @Test
    public void whenArrayLengthIsNotEven() {
        Turn a = new Turn();
        int[] array = {1, 2, 3, 4, 5};
        int[] result = a.back(array);
        int[] exp = {5, 4, 3, 2, 1};
        Assert.assertArrayEquals(exp, result);
    }
}
