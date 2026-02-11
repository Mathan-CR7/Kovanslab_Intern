package com.kovanslab.intern.inheritanceovercomposition;
class Heart {

    void beat() {
        System.out.println("Heart is beating...");
    }
}

class Human {

    private String name;
    private Heart heart;
    Human(String name) {
        this.name = name;
        this.heart = new Heart();
    }

    void live() {
        System.out.println(name + " is alive.");
        heart.beat();
    }
}

public class Composition{

    public static void main(String[] args) {

        Human h1 = new Human("Madhan");
        h1.live();
    }
}
