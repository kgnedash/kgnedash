package ru.job4j.max;

/**
 * Class Max.
 *
 * @author kgnedash
 * @version 1
 * @since 23.11.2017
 */

public class Max {
    public int max(int first, int second) {
        return (first > second) ? first : second;
    }

    public int max(int first, int second, int third) {
        return max(max(first, second), third);
    }
}