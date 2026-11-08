package com.POOCC.lab05;

public class SnakeWarrior extends Warrior {
    public SnakeWarrior(String name, int health) {
        super(name, health);
    }

    @Override
    public int getDamage() {
        return 10;
    }
}