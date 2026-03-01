package com.kovanslab.intern.threads;
class MyThreadss extends Thread {

    public void run() {

        for(int i=1; i<=5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            Thread.yield();
        }
    }
}

public class YieldThreadExample {

    public static void main(String[] args) {

        MyThreadss t1 = new MyThreadss();
        MyThreadss t2 = new MyThreadss();

        t1.setName("Thread-A");
        t2.setName("Thread-B");

        t1.start();
        t2.start();
    }
}