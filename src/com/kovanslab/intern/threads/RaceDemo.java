package com.kovanslab.intern.threads;
class Counter {
    int count = 0;

    synchronized void increment() {
        count++;
    }
}

class RaceDemo extends Thread {

    static Counter c = new Counter();

    public void run() {
        for(int i = 0; i < 1000; i++) {
            c.increment();
        }
    }

    public static void main(String[] args) throws Exception {

        RaceDemo t1 = new RaceDemo();
        RaceDemo t2 = new RaceDemo();
        RaceDemo t3 = new RaceDemo();
        RaceDemo t4 = new RaceDemo();
        RaceDemo t5 = new RaceDemo();

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();

        System.out.println("Final Count = " + c.count);
    }
}
