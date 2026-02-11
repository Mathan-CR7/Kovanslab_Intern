package com.kovanslab.intern.interfaceexample;


interface Vehicle
{
    void start();
    void stop();
}

class Cars implements Vehicle
{
    public void start()
    {
        System.out.println("Car Is Starting");
    }

    public void stop()
    {
        System.out.println("Car was stopped");
    }
}


public class NormalInterface
{
    public static void main(String[] args)
    {
        Vehicle c=new Cars();
        c.start();
        c.stop();
    }
}