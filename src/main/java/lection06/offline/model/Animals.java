package lection06.offline.model;

public class Animals {

    public static int countAnimals;

    private String name;

    public Animals(String name){
        this.name = name;
        countAnimals++;
    }

    protected void run(int obstacleLength) {
        System.out.println(getName() + " пробежал " + obstacleLength + " м.");
    }

    protected void sail(int swimmingDistance) {
        System.out.println(getName() + " проплыл " + swimmingDistance + " м.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
