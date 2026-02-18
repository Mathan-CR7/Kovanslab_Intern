package com.kovanslab.intern.collections;

import java.util.*;

public class VectorExample {
    public static void main(String[] args)  throws InterruptedException {
        {
            Vector <String> attendance= new Vector<>();

            Thread teacher1 =new Thread(()->{
                attendance.add("arya present");
            });

            Thread teacher2 =new Thread(()->{
                attendance.add("bala present");
            });

            Thread teacher3 =new Thread(()-> {
                attendance.add("manoj present");
            });
            teacher1.start();
            teacher2.start();
            teacher3.start();
            teacher1.join();
            teacher2.join();
            System.out.println(attendance);
        }
    }
}
