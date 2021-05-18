package Lection07.online;

import Lection07.online.models.Pet;
import Lection07.online.models.Soldier;

import java.util.Random;

public class Cat extends Pet {

    private final String ABILITY_CAT = "Double damage";

    private Random random = new Random();

    public Cat(String name, int attack, float defense, float hp) {
        super(name, attack, defense, hp);
    }

    public void hostProtection(Soldier enemy){
        if (enemy.getPet().equals("Dog")) {
            float dealDamage = (this.attack  * random.nextFloat()) * 2;
            enemy.setHp(getHp() - dealDamage);
            System.out.println(this.name + " " + ABILITY_CAT + " " + enemy.getName() + " >> " + dealDamage + " dmg.");
        } else {
            System.out.println("This is the owner");
        }
    }
}
