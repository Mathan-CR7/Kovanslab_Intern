package com.kovanslab.intern.threads;
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is created and running");
        System.out.println("Thread name "+ Thread.currentThread().getName() + " Thread ID " + Thread.currentThread().getId());
    }
}

public class ThreadCreationExample1
{
    public static void main(String[] args)
    {
        System.out.println("Main thread is running");
        System.out.println("Thread name "+ Thread.currentThread().getName() + "Thread ID " + Thread.currentThread().getId());
        MyThread t =new MyThread();
        t.start();
    }
}