package com.POOCC.lab05;

import java.util.Vector;

public class WarriorPack {
    private Vector<Warrior> warriors;

    public WarriorPack() {
        warriors = new Vector<>();
    }

    public void addWarrior(Warrior newWarrior) {
        warriors.add(newWarrior);
    }

    public Vector<Warrior> getWarriors() {
        return warriors;
    }

    public int calculateDamage() {
        int damage = 0;
        for (int i = 0; i < warriors.size(); i++) {
            damage += warriors.get(i).getDamage();
        }
        return damage;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("WarriorPack conține:\n");
        for (int i = 0; i < warriors.size(); i++) {
            sb.append("  - ").append(warriors.get(i).toString()).append("\n");
        }
        sb.append("Daune totale produse de grup: ").append(calculateDamage());
        return sb.toString();
    }
}