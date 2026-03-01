package com.kovanslab.intern.files;
import java.util.Random;

public class FridayChallenge {

    static abstract class Character {
        protected String name;
        protected int health;
        protected int strength;
        protected Random rand = new Random();

        public Character(String name, int health, int strength) {
            this.name = name;
            this.health = health;
            this.strength = strength;
        }

        public abstract void attack(Character opponent);

        public void takeDamage(int damage) {
            health -= damage;
            if (health < 0)
                health = 0;
        }

        public boolean isAlive() {
            return health > 0;
        }

        public void display() {
            System.out.println(name + " HP: " + health);
        }
    }

    static class Warrior extends Character {

        public Warrior(String name) {
            super(name, 150, 20);
        }

        @Override
        public void attack(Character opponent) {
            int damage = strength + rand.nextInt(10);
            System.out.println(name + " swings sword for " + damage + " damage!");
            opponent.takeDamage(damage);
        }
    }

    static class Mage extends Character {

        public Mage(String name) {
            super(name, 80, 35);
        }

        @Override
        public void attack(Character opponent) {
            int damage = strength + rand.nextInt(20);
            System.out.println(name + " casts FIREBALL for " + damage + " damage!");
            opponent.takeDamage(damage);
        }
    }
    static class Rogue extends Character {

        public Rogue(String name) {
            super(name, 100, 25);
        }
        public void attack(Character opponent) {
            int damage = strength + rand.nextInt(12);
            System.out.println(name + " strikes from shadows for " + damage + " damage!");
            opponent.takeDamage(damage);
        }
        public void takeDamage(int damage) {
            int dodgeChance = rand.nextInt(100);
            if (dodgeChance < 40) {
                System.out.println(name + " dodged the attack!");
            } else {
                super.takeDamage(damage);
            }
        }
    }
    public static void main(String[] args) {

        Character p1 = new Warrior("Thor");
        Character p2 = new Mage("Merlin");
        System.out.println(" BATTLE STARTS \n");

        int round = 1;

        while (p1.isAlive() && p2.isAlive()) {

            System.out.println("----- Round " + round + " -----");

            p1.attack(p2);
            p2.display();

            if (!p2.isAlive())
                break;

            p2.attack(p1);
            p1.display();

            System.out.println();
            round++;
        }

        System.out.println("\nRESULT");

        if (p1.isAlive())
            System.out.println(p1.name + " wins");
        else
            System.out.println(p2.name + " wins");
    }
}