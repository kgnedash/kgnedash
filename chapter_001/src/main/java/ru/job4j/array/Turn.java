package ru.job4j.array;

/**
 * Class Turn inverts the elements in an array.
 *
 * @author kgnedash
 * @version 1
 * @since 11.01.18
 */
public class Turn {
    public int[] back(int[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            int a = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = a;
        }
        return array;
    }
}