package com.kovanslab.intern.enums;
import java.util.Random;
abstract class Character {

    protected String name;
    protected int health;
    protected int strength;
    protected Random random = new Random();

    public Character(String name, int health, int strength) {
        this.name = name;
        this.health = health;
        this.strength = strength;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public abstract void attack(Character opponent);

    public void displayStatus() {
        System.out.println(name + " | Health: " + health);
    }

    public String getName() {
        return name;
    }
}


class Warrior extends Character {

    public Warrior(String name) {
        super(name, 150, 20);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(10);
        System.out.println(name + " swings sword for " + damage + " damage!");
        opponent.takeDamage(damage);
    }
}

class Mage extends Character {

    public Mage(String name) {
        super(name, 80, 35);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(20);
        System.out.println(name + " casts fireball for " + damage + " damage!");
        opponent.takeDamage(damage);
    }
}

class Rogue extends Character {

    public Rogue(String name) {
        super(name, 100, 25);
    }

    @Override
    public void attack(Character opponent) {
        int damage = strength + random.nextInt(15);
        System.out.println(name + " strikes from shadows for " + damage + " damage!");
        opponent.takeDamage(damage);
    }

    @Override
    public void takeDamage(int damage) {
        int dodgeChance = random.nextInt(100);
        if (dodgeChance < 30) {
            System.out.println(name + " dodged the attack!");
        } else {
            super.takeDamage(damage);
        }
    }
}

public class RPG{

    public static void main(String[] args) {

        Character p1 = new Warrior("Thor");
        Character p2 = new Rogue("Shadow");

        System.out.println(" BATTLE STARTS \n");

        int round = 1;

        while (p1.isAlive() && p2.isAlive()) {

            System.out.println("----- Round " + round + " -----");
            p1.attack(p2);
            p2.displayStatus();

            if (!p2.isAlive()) break;
            p2.attack(p1);
            p1.displayStatus();

            System.out.println();
            round++;
        }

        System.out.println(" BATTLE ENDED ");

        if (p1.isAlive()) {
            System.out.println(p1.getName() + " WINS!");
        } else {
            System.out.println(p2.getName() + " WINS!");
        }
    }
}
