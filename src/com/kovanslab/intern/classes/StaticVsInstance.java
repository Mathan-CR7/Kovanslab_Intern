package com.kovanslab.intern.classes;
class Demo
{
    static int count=0;
    int id;

    Demo()
    {
        count++;
        id=count;
    }
    void display()
    {
        System.out.println(" ID " + id + " Count "+count);
    }
}

public class StaticVsInstance {
    public static void main(String[] args)
    {
        Demo d =new Demo();
        Demo d1 =new Demo();
        Demo d2 =new Demo();
        d.display();
        d1.display();
        d2.display();
    }
}
