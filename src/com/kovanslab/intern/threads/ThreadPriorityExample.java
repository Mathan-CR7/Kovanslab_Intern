package com.kovanslab.intern.threads;
class MyThreadz extends Thread {

    public void run() {

        for(int i=1;i<=5;i++)
        {
            System.out.println(getName() + " running : " + i);
        }
    }
}

public class ThreadPriorityExample {

    public static void main(String[] args) {

        MyThreadz t1 = new MyThreadz();
        MyThreadz t2 = new MyThreadz();

        t1.setName("Low Priority Thread");
        t2.setName("High Priority Thread");

        t1.setPriority(1);
        t2.setPriority(10);

        t1.start();
        t2.start();
    }
}