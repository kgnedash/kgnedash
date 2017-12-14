package ru.job4j.loop;

import java.util.function.BiPredicate;

/**
 * Class Paint paints pyramid in pseudo-graphic.
 *
 * @author kgnedash
 * @version 1
 * @since 14.12.17
 */
public class Paint {

    /**
     * The method constructs the right half of the pyramid
     *
     * @param h height
     * @return result
     */
    public String rightTrl(int h) {
        return this.loopBy(
                h,
                h,
                (i, j) -> i >= j
        );
    }

    /**
     * The method constructs the left half of the pyramid
     *
     * @param h height of the pyramid
     * @return result
     */
    public String leftTrl(int h) {
        return this.loopBy(
                h,
                h,
                (i, j) -> i >= h - j - 1
        );
    }

    /**
     * The method constructs the pyramid
     *
     * @param h height
     * @return result
     */
    public String pyramid(int h) {
        return this.loopBy(
                h,
                2 * h - 1,
                (i, j) -> i >= h - j - 1 && i + h - 1 >= j
        );
    }

    /**
     * New universal method for conditions
     *
     * @param h       height of the pyramid
     * @param w       weight of the pyramid
     * @param predict java Generics
     * @return
     */
    private String loopBy(int h, int w, BiPredicate<Integer, Integer> predict) {
        //creating an object of class StringBuilder
        StringBuilder screen = new StringBuilder();
        //Loop for building the pyramid, i counts rows, j counts columns
        for (int i = 0; i != h; i++) {
            for (int j = 0; j != w; j++) {
                if (predict.test(i, j)) {
                    //adding the symbol "^" in the screen object
                    screen.append("^");
                } else {
                    //adding the symbol " " in the screen object
                    screen.append(" ");
                }
            }
            //adding the line break
            screen.append(System.lineSeparator());
        }
        //returns the result
        return screen.toString();
    }
}
