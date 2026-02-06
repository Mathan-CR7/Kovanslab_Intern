package com.kovanslab.intern.classes;


class Vehicle
{
    int id=90;
}
class Car extends Vehicle
{
    int id =104;
    void show()
    {
        System.out.println(super.id);
        System.out.println(id);
    }
}
public class SuperKeyword {
    public static void main(String[] args)
    {
        Car c= new Car();
        c.show();
    }
}

