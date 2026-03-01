package com.kovanslab.intern.threads;
class Task implements Runnable
{
    public void run()
    {
        try
        {
            System.out.println("Thread is Created and Running");
            for(int i=0;i<5;i++)
            {
                System.out.println("Thread count " +i);
                Thread.sleep(2000);
            }
        }
        catch(Exception e)
        {
            System.out.println("An Error Occur");
        }
    }
}
public class ThreadSleepExample
{
    public static void main(String[] args)
    {
        Thread t =new Thread(new Task());
        t.start();
    }
}