package ru.job4j.loop;

/**
 * Class Paint painting pyramid in pseudo-graphic.
 *
 * @author kgnedash
 * @version 1
 * @since 13.12.17
 */
public class Paint {
    public String rightTrl(int h) {
        int w = h;
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i != h; i++) {
            for (int j = 0; j != w; j++) {
                if (i >= j) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

    public String leftTrl(int h) {
        int w = h;
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i != h; i++) {
            for (int j = 0; j != w; j++) {
                if (i >= w - j - 1) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }

    public String piramid(int h) {
        int w = (h * 2) - 1;
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i != h; i++) {
            for (int j = 0; j != w; j++) {
                if (i >= h - j - 1 && i + h - 1 >= j) {
                    screen.append("^");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
