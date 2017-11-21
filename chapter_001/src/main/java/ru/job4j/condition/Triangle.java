package ru.job4j.condition;

/**
 * Class Triangle.
 *
 * @author kgnedash
 * @version 1
 * @since 20.11.2017
 */

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Method calculating the distance between the points.
     */
    public double distance(Point left, Point right) {
        return Math.sqrt(Math.pow(right.getX() - left.getX(), 2) + Math.pow(right.getY() - left.getY(), 2));
    }

    /**
     * Method calculating the half of perimeter.
     */
    public double period(double ab, double ac, double bc) {
        return (ab + ac + bc) / 2;
    }

    /**
     * Method calculating the area of triangle.
     */
    public double area() {
        double rsl = -1;
        double ab = this.distance(this.a, this.b);
        double ac = this.distance(this.a, this.c);
        double bc = this.distance(this.b, this.c);
        double p = this.period(ab, ac, bc);
        if (this.exist(ab, ac, bc)) {
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;
    }

    /**
     * Method checking the possibility to construct the triangle with such sides.
     */
    private boolean exist(double ab, double ac, double bc) {
        return ab > 0 && ac > 0 && bc > 0;
    }
}