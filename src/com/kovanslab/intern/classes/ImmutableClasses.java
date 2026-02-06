package com.kovanslab.intern.classes;


final class Employee
{
    private final int id;
    private final String name;
    private final double salary;

    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
    int getId()
    {
        return id;
    }
    String getName()
    {
        return name;
    }
    double getSalary()
    {
        return salary;
    }
}

public class ImmutableClasses {
    public static void main(String[] args)
    {
        Employee e= new Employee(101,"Mathan",43000);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
