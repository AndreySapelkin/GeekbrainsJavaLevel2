package lection01.offline.task1;

import java.util.Random;

public class HomeWorkApp {

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Задание 2");
        System.out.println();
        printThreeWords();

        System.out.println();
        System.out.println("Задание 3");
        System.out.println();
        checkSumSign();

        System.out.println();
        System.out.println("Задание 4");
        System.out.println();
        printColor();

        System.out.println();
        System.out.println("Задание 5");
        System.out.println();
        compareNumbers();

    }

    public static void printThreeWords() {
        System.out.println("_Orange");
        System.out.println("_ Banana");
        System.out.println("_ Apple");
    }

    public static void checkSumSign() {
        Random random = new Random();

        int a = random.nextInt(100000) - 50000;
        int b = random.nextInt(100000) - 50000;

        if ((a + b) >= 0)
            System.out.println("Сумма положительная");
        else
            System.out.println("Сумма отрицательная");

    }

    public static void printColor() {
        Random random = new Random();

        int value = random.nextInt(100000) - 50000;

//TODO: IDEA ругается, что значение value > 0 и value > 100, всегда будет истинным. Это не верно.
        if (value <= 0)
            System.out.println("Красный");
        else if (value > 0 && value <= 100)
            System.out.println("Желтый");
        else if (value > 100)
            System.out.println("Зеленый");
    }

    private static void compareNumbers() {
        Random random = new Random();

        int a = random.nextInt(100000) - 50000;
        int b = random.nextInt(100000) - 50000;

        if (a >= b) {
            System.out.println("a >= b");
        } else
            System.out.println("a < b");
    }
}
