package ru.job4j.loop;

/**
 * Class Board painting chess desk in pseudo-graphic.
 *
 * @author kgnedash
 * @version 1
 * @since 30.11.17
 */
public class Board {
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i % 2 == j % 2) {
                    screen.append("x");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
