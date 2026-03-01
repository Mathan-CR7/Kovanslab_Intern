package com.kovanslab.intern.streams;
import java.util.*;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        Consumer<Integer> squre = s -> System.out.println("Square : "+(s*s));
        squre.accept(5);
        Consumer<String> print = name -> System.out.println("Hello " +name);
        print.accept("Mathan");
        Consumer<String> print1 = n -> System.out.println("Hii " +n);
        print1.accept("Mukesh");
        List<String> li = Arrays.asList("Mathan","Santhosh","Sarathi");
        li.stream().forEach(x -> System.out.println(x));
        Consumer<String> c1= i -> System.out.println("Hello " + i);
        Consumer<String> c2= l -> System.out.println("Good " + l);
        Consumer<String> combine =c1.andThen(c2);
        combine.accept("Mathan");

    }
}
