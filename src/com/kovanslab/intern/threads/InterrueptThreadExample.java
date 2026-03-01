package com.kovanslab.intern.threads;
class Threadz extends Thread {

    public void run() {
        try {
            for(int i = 1; i <= 10; i++) {

                System.out.println(" Thread Running : " + i);
                Thread.sleep(1000);
            }
        }
        catch(InterruptedException e) {
        }
    }
}

public class InterrueptThreadExample {
    public static void main(String[] args) throws Exception {

        Threadz t = new Threadz();
        System.out.println("Before Thread Start "+t.isAlive());
        t.start();
        System.out.println("After Thread Start "+t.isAlive());
        Thread.sleep(3000);
        t.interrupt();
        System.out.println("Main thread finished");
        System.out.println("After Thread Start "+t.isAlive());

    }
}