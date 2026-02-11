package com.kovanslab.intern.classes;
abstract class Employee
{
    abstract void status();
    void show()
    {
        System.out.println("Employee Salary is 50k");
    }
}

class User extends Employee
{
    void status()
    {
        System.out.println("Completed");
    }
}

public class AbstractAndNonAbstarctMethod {
    public static void main(String[] args)
    {
        Employee e =new User();
        e.status();
        e.show();
    }
}
