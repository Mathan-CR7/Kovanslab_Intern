package com.kovanslab.intern.classes;
class Demos {

    public int a = 10;
    protected int b = 20;
    int c = 30;
    private int d = 40;

    void show() {
        // All accessible inside the same class
        System.out.println("public a = " + a);
        System.out.println("protected b = " + b);
        System.out.println("default c = " + c);
        System.out.println("private d = " + d);
    }
}

public class AccessModifiers {
    public static void main(String[] args) {

        Demos obj = new Demos();

        System.out.println(obj.a);
        System.out.println(obj.b);
        System.out.println(obj.c);

        obj.show();
    }
}
