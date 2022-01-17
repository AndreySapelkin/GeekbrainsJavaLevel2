package ru.geekbrains.java2.lessons.l1_oop;

public class Subtractor implements Calculator {
    @Override
    public double calculate(double a, double b) {
        return a - b;
    }
}
