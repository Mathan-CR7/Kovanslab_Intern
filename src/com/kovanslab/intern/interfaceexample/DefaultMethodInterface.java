package com.kovanslab.intern.interfaceexample;
interface Car
{
    default void start()
    {
        checkFuel();
        System.out.println("Car is Started");
    }
    private void checkFuel()
    {
        System.out.println("Checking Fuel Level");
    }
}
class Test implements Car
{

}
public class DefaultMethodInterface {
    public static void main(String[] args)
    {
        Car c= new Test();
        c.start();
    }
}
