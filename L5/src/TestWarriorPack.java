package com.POOCC.lab05;

public class TestWarriorPack {
    public static void main(String[] args) {
        WarriorPack pack = new WarriorPack();

        pack.addWarrior(new SnakeWarrior("Kaa", 100));
        pack.addWarrior(new OgreWarrior("Shrek", 90));
        pack.addWarrior(new MarshmallowManWarrior("Stay Puft", 80));

        System.out.println(pack);
    }
}