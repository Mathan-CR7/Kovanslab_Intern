package com.kovanslab.intern.advancedconcurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FixedThreadExample
{
    static class MyTask implements Runnable
    {
        public void run()
        {
            System.out.println("The Task Is Running By "+ Thread.currentThread().getName());
        }
    }

    public static void main(String[] args)
    {
        ExecutorService task = Executors.newFixedThreadPool(3);

        for(int i=0;i<=8;i++)
        {
            task.execute(new MyTask());
        }
        System.out.println("Task in completed succesfully");
    }
}