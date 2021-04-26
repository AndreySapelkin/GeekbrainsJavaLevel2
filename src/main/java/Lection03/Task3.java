package Lection03;

import java.util.Random;

public class Task3 {

    public static Random random = new Random();

    public static void main(String[] args) {
        System.out.println("****************** Задание 1 **************************");
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1};
        printIntOneDimensionalArray(arrReplacement(arr));

        System.out.println("****************** Задание 2 **************************");
        int[] arr2 = new int[100];
        printIntOneDimensionalArray(fillingTheArray(arr2));

        System.out.println("****************** Задание 3 **********************");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        printIntOneDimensionalArray(multiplicationByTwo(arr3));

        System.out.println("****************** Задание 4 *************************");
        int[][] arr4 = new int[5][5];
        printIntMultidimensionalArray(fillingInTheDiagonals(arr4));

        System.out.println("******************* Задание 5 *************************");
        int[] arr5 = new int [10];
        printIntOneDimensionalArrayInLine(randomFillingTheArray(arr5));
        System.out.println("");
        System.out.println("Максимальный элемент массива равен: " + searchMax(arr5));
        System.out.println("Минимальный элемент массива равен: " + searchMin(arr5));

    }

    public static int[] arrReplacement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1)
                arr[i] = 0;
            else
                arr[i] = 1;
        }
        return arr;
    }

    public static void printIntOneDimensionalArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.println("\t|\t");
        }

    }

    public static void printIntOneDimensionalArrayInLine(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t|\t");
        }

    }

    public static void printIntMultidimensionalArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print("\t|\t");
            }
            System.out.println();
        }

    }

    public static int[] fillingTheArray(int[] arr2) {
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
        }
        return arr2;
    }

    public static int[] randomFillingTheArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] = random.nextInt(100) - 50;
        }
        return arr;
    }

    public static int[] multiplicationByTwo(int[] arr3) {
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6)
                arr3[i] = arr3[i] * 2;
        }
        return arr3;
    }

    public static int[][] fillingInTheDiagonals(int[][] arr4) {
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                if (i == j) {
                    arr4[i][j] = 1;
                    arr4[i][arr4.length - j - 1] = 1;
                    break;
                } else
                    arr4[i][j] = random.nextInt(30);
            }
        }

        return arr4;

    }

    public static int searchMax(int[] arrForSearchMax){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arrForSearchMax.length; i++) {
            if(arrForSearchMax[i] > max)
                max = arrForSearchMax[i];
        }
        return max;
    }

    public static int searchMin(int[] arrForSearchMin){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arrForSearchMin.length; i++) {
            if(arrForSearchMin[i] < min)
                min = arrForSearchMin[i];
        }
        return min;
    }

}

