package com.kovanslab.intern.classes;


class Person{
    void show()
    {
        System.out.println("Person is Sleeping");
    }
}

class Employees extends Person
{
    void show()
    {
        super.show();
        System.out.println("Employee is Working");
    }
}

public class SuperKeywordInMethod {
    public static void main(String[] args) {
        {
            Employees e= new Employees();
            e.show();
        }
    }
}

