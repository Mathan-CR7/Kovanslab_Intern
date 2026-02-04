package com.kovanslab.intern.classes;
class Students
{
    int id;
    String name;

    void display()
    {
        System.out.println("Studying");
    }
    Students()
    {
        System.out.println("Object is Created");
    }
}

public class NormalClass
{
    public static void main(String[] args)
    {
        Students s=new Students();
        s.id=103;
        s.name="mathan";
        System.out.println(s.id);
        System.out.println(s.name);
        s.display();
    }
}
