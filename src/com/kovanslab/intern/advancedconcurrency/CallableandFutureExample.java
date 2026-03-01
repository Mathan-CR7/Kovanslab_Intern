package com.kovanslab.intern.advancedconcurrency;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class MarksCalculator implements Callable<Integer> {

    public Integer call() {
        System.out.println("Teacher correcting paper on " + Thread.currentThread().getName());

        return 95;
    }
}

public class CallableandFutureExample {

    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        MarksCalculator task = new MarksCalculator();
        Future<Integer> result = service.submit(task);
        System.out.println("Student is waiting for result...");
        int marks = result.get();
        System.out.println("Student got marks: " + marks);
        service.shutdown();
    }
}