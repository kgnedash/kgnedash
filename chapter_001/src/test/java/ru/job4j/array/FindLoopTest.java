package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author kgnedash
 * @version 1
 * @since 20.12.17
 */
public class FindLoopTest {
    @Test
    public void whenIndexFound() {
        FindLoop a = new FindLoop();
        int[] data = {1, 2, 3};
        int result = a.indexOf(data, 3);
        assertThat(result, is(2));
    }

    @Test
    public void whenIndexNotFound() {
        FindLoop a = new FindLoop();
        int[] data = {1, 2, 3};
        int result = a.indexOf(data, 5);
        assertThat(result, is(-1));
    }
}