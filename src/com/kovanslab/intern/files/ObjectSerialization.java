package com.kovanslab.intern.files;
import java.io.*;
import java.util.Random;

public class ObjectSerialization{

    private static final String FILE_NAME = "character.dat";
    static class Character implements Serializable {
        String name;
        int health;
        int strength;
        transient Random random = new Random();

        public Character(String name, int health, int strength) {
            this.name = name;
            this.health = health;
            this.strength = strength;
        }
        private void readObject(ObjectInputStream in)
                throws IOException, ClassNotFoundException {
            in.defaultReadObject();
            random = new Random();
        }

        public void display() {
            System.out.println("Character Details");
            System.out.println("-----------------");
            System.out.println("Name     : " + name);
            System.out.println("Health   : " + health);
            System.out.println("Strength : " + strength);
        }
    }

    public static void save(Character c) {
        try (ObjectOutputStream oos =
                     new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {

            oos.writeObject(c);
            System.out.println("Game Saved Successfully!");

        } catch (IOException e) {
            System.out.println("Error occur");
        }
    }
    public static Character load() {
        try (ObjectInputStream ois =
                     new ObjectInputStream(new FileInputStream(FILE_NAME))) {

            Character c = (Character) ois.readObject();
            System.out.println("Game Saved");
            return c;

        } catch (Exception e) {
            return null;
        }
    }
    public static void main(String[] args) {
        Character hero = load();

        if (hero == null) {
            hero = new Character("Thor", 150, 20);
            System.out.println("New Character Created:");
            hero.display();
            save(hero);
        }
        else {
            System.out.println("Game Resumed:\n");
            hero.display();
        }
    }
}