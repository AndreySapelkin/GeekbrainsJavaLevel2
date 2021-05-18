package lection06.offline;

import lection06.offline.model.Animals;

public class Dog extends Animals {

    private static final int MAX_OBSTACLE_LENGTH_DOG = 500;
    private static final int MAX_SWIM_DISTANCE_DOG = 10;

    public Dog(String name) {
        super(name);
    }

    protected void run(int obstacleLength) {
        if (obstacleLength <= MAX_OBSTACLE_LENGTH_DOG && obstacleLength > 0)
            System.out.println(getName() + " пробежал " + obstacleLength + " м.");
        else if (obstacleLength > MAX_OBSTACLE_LENGTH_DOG)
            System.out.println("Собака не может пробежать больше 500 метров");
        else
            System.out.println("Длина не может быть отрицательной или равняться нулю");
    }

    protected void sail(int swimmingDistance) {
        if (swimmingDistance <= MAX_SWIM_DISTANCE_DOG && swimmingDistance > 0)
            System.out.println(getName() + " проплыл " + swimmingDistance + " м.");
        else if (swimmingDistance > MAX_SWIM_DISTANCE_DOG)
            System.out.println("Собака не может проплыть больше 10 метров");
        else
            System.out.println("Длина заплыва не может быть отрицательной или равняться нулю");
    }
}
