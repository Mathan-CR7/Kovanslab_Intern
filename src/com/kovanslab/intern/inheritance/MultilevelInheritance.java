package com.kovanslab.intern.inheritance;


class Person
{
    void walk()
    {
        System.out.println("Person Can Walk");
    }
}

class Employee extends Person
{
    void work()
    {
        System.out.println("Employee can Work");
    }
}

class Manager extends Employee
{
    void manage()
    {
        System.out.println("Manager can manage the team");
    }
}

public class MultilevelInheritance {
    public static void main(String[] args) {
        {
            Manager m =new Manager();
            m.walk();
            m.work();
            m.manage();
        }
    }
}
