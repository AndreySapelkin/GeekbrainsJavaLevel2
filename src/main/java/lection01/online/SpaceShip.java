package lection01.online;

import java.io.Serializable;

public class SpaceShip implements Flying, Serializable {
    @Override
    public void fly() {
        System.out.println("Space ship fly");
    }
}
