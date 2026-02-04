package com.kovanslab.intern.classes;

class Student
{
    static class Performance
    {
        String name;
        int marks;
        void display()
        {
            System.out.println("Good Performance");
        }
    }
}


public class StaticClass{
    public static void main(String[] args)
    {
        Student.Performance p =new Student.Performance();
        System.out.println(p.name="Mathan");
        System.out.println(p.marks=80);
        p.display();

    }
}
