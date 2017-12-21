package ru.job4j.array;

/**
 * Class Square create the array with the powers of numbers.
 *
 * @author kgnedash
 * @version 1
 * @since 21.12.17
 */
public class Square {
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i < bound + 1; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}
