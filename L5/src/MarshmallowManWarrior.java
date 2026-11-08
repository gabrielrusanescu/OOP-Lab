package com.POOCC.lab05;

public class MarshmallowManWarrior extends Warrior {
    public MarshmallowManWarrior(String name, int health) {
        super(name, health);
    }

    @Override
    public int getDamage() {
        return 1;
    }
}