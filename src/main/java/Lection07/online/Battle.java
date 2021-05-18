package Lection07.online;

/**
 * Created by Aleksandr Gladkov [Anticisco]
 * Date: 12.05.2021
 */

public class Battle {

    private static int round = 1;

    public static void main(String[] args) throws InterruptedException {
        LightSoldier lightSoldier = new LightSoldier("LightSoldier", 15, 25f, 100f, "Dog");
        DarkSoldier darkSoldier = new DarkSoldier("DarkSoldier", 20, 5f, 150f, "Cat");
        Dog dog = new Dog("Tuzik", 5, 2f, 20);
        Cat cat = new Cat("Vaska", 4, 1f, 10);

        lightSoldier.attack(lightSoldier);

        while (!lightSoldier.isDeadHero() || !darkSoldier.isDeadHero()) {
            System.out.println("*** Round " + round + " ***");
            System.out.println(lightSoldier.getMeInfo());
            System.out.println(darkSoldier.getMeInfo());

            lightSoldier.attack(darkSoldier);
            cat.hostProtection(lightSoldier);

            if (darkSoldier.isDeadHero()) {
                System.out.println(lightSoldier.getName() + " win!");
                break;
            }

            darkSoldier.attack(lightSoldier);
            dog.hostProtection(darkSoldier);

            if (lightSoldier.isDeadHero()) {
                System.out.println(darkSoldier.getName() + " win!");
                break;
            }

            round++;

            Thread.sleep(3000);
        }
    }
}
