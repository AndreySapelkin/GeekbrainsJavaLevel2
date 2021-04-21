package lection02;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Random;

public class Task2 {

    public static Random random = new Random();

    public static int a = random.nextInt(30) - 10;
    public static int b = random.nextInt(30) - 10;
    public static int c = random.nextInt(100) - 50;
    public static int d = random.nextInt(100) - 50;
    public static String s = "Я стану хорошим программистом!";

    public static void main(String[] args) {

        System.out.println("******************Задание 1**************************");
        System.out.println(belongingToTheSegment(a, b));

        System.out.println("******************Задание 2**************************");
        printResultCheckSign(c);

        System.out.println("******************Задание 3**********************");
        System.out.println(reversSign(d));

        System.out.println("******************Задание 4*************************");
        printString(s, 10);

        System.out.println("*******************Задание 5*************************");
        for (int i = 1; i <= 3500; i++) {
            if(leapYear(i))
                System.out.println("Год " + i + " - високосный");
            else
                System.out.println("Год " + i + " - НЕ високосный");
        }

    }

    public static boolean belongingToTheSegment(int a, int b) {
        int sum = theSumOfTwoNumbers(a, b);

        return sum >= 10 && sum <= 20;
    }

    public static int theSumOfTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void printResultCheckSign(int c) {

        if (checkSign(c))
            System.out.println("Число, положительное.");
        else
            System.out.println("Число, отрицательное.");
    }

    public static boolean checkSign(int number) {
        return number >= 0;
    }

    public static boolean reversSign(int number) {
        return number < 0;
    }

    public static void printString(String value, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(value);
        }
    }

    public static boolean leapYear(int year){

            return year % 400 == 0 || year % 4 == 0 && year % 100 != 0;
    }

}
