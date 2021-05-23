package Lection07.online.models;

import java.util.Random;

public class Pet extends Soldier{

    private String abylity;

    private Random random = new Random();

    public Pet(String name, int attack, float defense, float hp) {
        super(name, attack, defense, hp);
    }

    public void hostProtection(Soldier enemy){
        if (enemy != this) {
            float dealDamage = (this.attack - (this.attack / enemy.defense)) * random.nextFloat();
            enemy.hp -= dealDamage;
            System.out.println(this.name + " deal damage > " + enemy.name + " >> " + dealDamage + " dmg.");
        } else {
            System.out.println("This is the owner");
        }
    }

    public String getAbylity() {
        return abylity;
    }

    public void setAbylity(String abylity) {
        this.abylity = abylity;
    }
}
