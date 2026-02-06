package com.kovanslab.intern.inheritance;


class Transport
{
    void show()
    {
        System.out.println("Types of Transports");
    }
}

class Car extends Transport
{
    void showCar()
    {
        System.out.println("Car Runs on Four Wheels");
    }
}
class Bike extends Transport
{
    void showBike()
    {
        System.out.println("Bike Runs on Two Wheels ");
    }
}
class Bus extends Transport
{
    void showBus()
    {
        System.out.println("Bus Is Used For Public Transportation");
    }
}
public class HierarchicalInheritance
{
    public static void main(String[] args)
    {
        Car c =new Car();
        Bike b=new Bike();
        Bus bu=new Bus();

        c.show();
        c.showCar();
        b.show();
        b.showBike();
        bu.show();
        bu.showBus();

    }
}