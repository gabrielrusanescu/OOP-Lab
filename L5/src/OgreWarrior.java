package com.POOCC.lab05;

public class OgreWarrior extends Warrior {
    public OgreWarrior(String name, int health) {
        super(name, health);
    }

    @Override
    public int getDamage() {
        return 6;
    }
}