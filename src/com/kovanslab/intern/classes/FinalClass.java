package com.kovanslab.intern.classes;

final class Studentz
{
    String name;
    int marks;
    void display()
    {
        System.out.println("Student Pass");
    }
}


public class FinalClass {
    public static void main(String[] args) {
        Studentz s= new Studentz();
        s.name="Mathan";
        s.marks=80;
        System.out.println(s.name);
        System.out.println(s.marks);

        s.display();

    }
}

