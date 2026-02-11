package com.kovanslab.intern.inheritanceovercomposition;
interface Engine
{
    void show();
}

class ElectricEngine implements Engine
{
    public void show()
    {
        System.out.println("Electric Engine is Started");
    }
}

class PetrolEngine implements Engine
{
    public void show()
    {
        System.out.println("Petrol Engine Started");
    }
}

class Car
{
    private Engine engine;

    void setValue(Engine engine)
    {
        this.engine = engine;
    }

    void drive()
    {
        if (engine == null)
        {
            System.out.println("Engine not injected ");
        }
        else
        {
            engine.show();
            System.out.println("Car is moving ");
        }
    }
}

public class SetterDependency
{
    public static void main(String[] args)
    {
        Engine petrol = new PetrolEngine();
        Car c =new Car();
        c.drive();
        c.setValue(petrol);
        c.drive();

        Engine electric = new ElectricEngine();
        c.setValue(electric);
        c.drive();
    }
}