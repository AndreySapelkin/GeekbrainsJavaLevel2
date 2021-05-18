package lection06.offline;

import lection06.offline.model.Animals;

public class Cat extends Animals {

    public static final int MAX_OBSTACLE_LENGTH_CAT = 200;

    public Cat(String name) {
        super(name);
    }

    protected void run(int obstacleLength) {
        if(obstacleLength <= MAX_OBSTACLE_LENGTH_CAT && obstacleLength > 0)
            System.out.println(getName() + " пробежал " + obstacleLength + " м.");
        else if(obstacleLength > MAX_OBSTACLE_LENGTH_CAT)
            System.out.println("Кот не может пробежать больше 200 метров");
        else
            System.out.println("Длина не может быть отрицательной или равняться нулю");
    }

    protected void sail() {
        System.out.println("Коты не умеют плавать");
    }
}
