package com.POOCC.lab05;

public abstract class Warrior {
    private String name;
    private int health;

    public Warrior(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public abstract int getDamage();

    @Override
    public String toString() {
        return "Tip: " + this.getClass().getSimpleName() + ", Nume: " + name + ", Sănătate: " + health;
    }
}