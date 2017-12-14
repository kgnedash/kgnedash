
package ru.job4j.loop;

import org.junit.Test;

import java.util.StringJoiner;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

/**
 * Test.
 *
 * @author kgnedash
 * @version 1
 * @since 14.12.17
 */
public class PaintTest {
    /**
     * Method for testing the right half of the pyramid
     */
    @Test
    public void whenPyramid4Right() {
        //creates an object of class Paint
        Paint paint = new Paint();
        //calculates the result of the rightTrl method
        String rst = paint.rightTrl(4);
        //prints out the result
        System.out.println(rst);
        //comparing the result with expected
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("^   ")
                                .add("^^  ")
                                .add("^^^ ")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Method for testing the left half of the pyramid
     */
    @Test
    public void whenPyramid4Left() {
        //creates an object of class Paint
        Paint paint = new Paint();
        //calculates the result of the leftTrl method
        String rst = paint.leftTrl(4);
        //prints out the result
        System.out.println(rst);
        //comparing the result with expected
        assertThat(rst,
                is(
                        new StringJoiner(System.lineSeparator(), "", System.lineSeparator())
                                .add("   ^")
                                .add("  ^^")
                                .add(" ^^^")
                                .add("^^^^")
                                .toString()
                )
        );
    }

    /**
     * Method for testing the pyramid with height equals two
     */
    @Test
    public void whenPyramidWithHeightTwoThenStringWithTwoRows() {
        //creates an object of class Paint
        Paint paint = new Paint();
        //calculates the result of the pyramid method with height equals 2
        String result = paint.pyramid(2);
        //creates the expected result
        final String line = System.getProperty("line.separator");
        String expected = String.format(" ^ %s^^^%s", line, line);
        //comparing the result with expected
        assertThat(result, is(expected));
    }

    /**
     * Method for testing the pyramid with height equals three
     */
    @Test
    public void whenPyramidWithHeightThreeThenStringWithThreeRows() {
        //creates an object of class Paint
        Paint paint = new Paint();
        //calculates the result of the pyramid method with height equals 3
        String result = paint.pyramid(3);
        //creates the expected result
        final String line = System.getProperty("line.separator");
        String expected = String.format("  ^  %s ^^^ %s^^^^^%s", line, line, line);
        //comparing the result with expected
        assertThat(result, is(expected));
    }
}
