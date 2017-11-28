package ru.job4j.loop;

public class Factorial {
    public int calc(int n) {
        int a = 1;
        for (int i = 1; i <= n; i++) {
            a *= i;
        }
        return a;
    }
}