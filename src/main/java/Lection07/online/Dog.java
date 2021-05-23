package Lection07.online;

import Lection07.online.models.Pet;
import Lection07.online.models.Soldier;

import java.util.Random;

public class Dog extends Pet {

    private Random random = new Random();

    private final String ABILITY_DOG = "Ignore protection";

    public Dog(String name, int attack, float defense, float hp) {
        super(name, attack, defense, hp);
    }

    public void hostProtection(Soldier enemy){
        if (enemy.getPet().equals("Cat")) {
            float dealDamage = this.attack * random.nextFloat();
            enemy.setHp(getHp() - dealDamage);
            System.out.println(this.name + " " + ABILITY_DOG+ " " +enemy.getName() + " >> " + dealDamage + " dmg.");
        } else {
            System.out.println("This is the owner");
        }
    }
}
