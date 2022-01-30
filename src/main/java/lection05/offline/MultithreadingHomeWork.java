package lection05.offline;

import java.util.Arrays;

public class MultithreadingHomeWork {

    static final int size = 100000000;
    static final int h = size / 2;

    public static void main(String[] args) {

        calculationsInOneThread();
        calculationsInTwoThread();

    }


    private static void calculationsInOneThread() {
        float[] arr = new float[size];
        Arrays.fill(arr, 1);

        System.out.println("НАЧАЛО ВЫЧИСЛЕНИЙ В ОДИН ПОТОК.");
        long a = System.currentTimeMillis();

        Worker runner1 = new Worker(arr);
        runner1.start();

        try {
            runner1.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("Затраченное время: " +
                (System.currentTimeMillis() - a) + " мс");
        System.out.println("КОНЕЦ ВЫЧИСЛЕНИЙ В ОДИН ПОТОК.");

    }

    private static void calculationsInTwoThread() {
        System.out.println("\n");
        System.out.println("\n");
        float[] arr = new float[size];
        Arrays.fill(arr, 1);

        System.out.println("НАЧАЛО ВЫЧИСЛЕНИЙ В ДВА ПОТОКА.");
        long a = System.currentTimeMillis();

        float[] subArr1 = new float[h];
        float[] subArr2 = new float[h];

        System.arraycopy(arr, 0, subArr1, 0, h);
        System.arraycopy(arr, h, subArr2, 0, h);

        Worker runner1 = new Worker(subArr1);
        Worker runner2 = new Worker(subArr2);

        runner1.start();
        runner2.start();

        try {
            runner1.join();
            runner2.join();
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        System.arraycopy(subArr1, 0, arr, 0, h);
        System.arraycopy(subArr2, 0, arr, h, h);

        System.out.println("Затраченное время: " +
                (System.currentTimeMillis() - a) + " мс");
        System.out.println("КОНЕЦ ВЫЧИСЛЕНИЙ В ДВА ПОТОКА.");

    }

    static class Worker extends Thread {
        private float[] internal;

        Worker(float[] arr) {
            internal = arr;
        }

        public float[] getArr() {
            return internal;
        }

       private void calculate(float[] f){
           for (int i = 0; i < f.length; i++) {
               f[i] = (float) (f[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
           }
       }

        public void run() {
            calculate(internal);
        }
    }

}
