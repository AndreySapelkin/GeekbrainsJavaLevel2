package ru.geekbrains.java2.lessons.l1_oop;

import java.io.Serializable;

public class SpaceShip implements Flying, Serializable {
    @Override
    public void fly() {
        System.out.println("Space ship fly");
    }
}
