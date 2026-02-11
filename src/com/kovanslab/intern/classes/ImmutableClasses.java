package com.kovanslab.intern.classes;


final class Employeees
{
    private final int id;
    private final String name;
    private final double salary;

    Employeees(int id,String name,double salary)
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
        Employeees e= new Employeees(101,"Mathan",43000);
        System.out.println(e.getId());
        System.out.println(e.getName());
        System.out.println(e.getSalary());
    }
}
