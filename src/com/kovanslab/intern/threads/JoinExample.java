package com.kovanslab.intern.threads;
class Task1 implements Runnable {
    public void run() {
        for(int i=1;i<=3;i++){
            System.out.println("Thread : " + i);
        }
    }
}

public class JoinExample {
    public static void main(String[] args) throws Exception {
        Thread t = new Thread(new Task1());
        t.start();

        t.join();

        System.out.println("Main finished");
    }
}