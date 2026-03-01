package com.kovanslab.intern.advancedconcurrency;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample
{
    static class Mythread implements Runnable
    {
        String taskname;

        public Mythread(String taskname) {
            this.taskname= taskname;
        }

        public void run()
        {
            System.out.println(taskname +" " +Thread.currentThread().getName()+" thread is Running");
        }

    }
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        executor.execute(new Mythread("Task 1"));
        executor.execute(new Mythread("Task 2"));
        executor.execute(new Mythread("Task 3"));
    }
}