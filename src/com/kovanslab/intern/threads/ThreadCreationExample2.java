package com.kovanslab.intern.threads;

class MyThreads implements Runnable
{
    public void run()
    {
        System.out.println("Thread is Created and Running");
    }
}

public class ThreadCreationExample2{
    public static void main(String[] args)
    {
        System.out.println("Main Thread is Running");
        Thread t= new Thread(new MyThreads());
        t.start();
    }
}
