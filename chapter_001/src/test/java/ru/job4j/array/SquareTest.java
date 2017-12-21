package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

/**
 * Test.
 *
 * @author kgnedash
 * @version 1
 * @since 21.12.17
 */
public class SquareTest {
    @Test
    public void whenCalculateBoundThree() {
        Square calc = new Square();
        int[] result = calc.calculate(3);
        int[] exp = {1, 4, 9};
        Assert.assertArrayEquals(exp, result);

    }
}
