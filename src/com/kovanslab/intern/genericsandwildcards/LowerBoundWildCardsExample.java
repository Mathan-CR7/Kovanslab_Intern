package com.kovanslab.intern.genericsandwildcards;


import java.util.*;

public class LowerBoundWildCardsExample {
    public static void addNumbers(List<? super Integer> list)
    {
        list.add(10);
        list.add(20);
        list.add(30);

    }

    public static void main(String[] args) {
        List<Integer> li = new ArrayList<>();
        List<Number> ln =new ArrayList<>();
        List<Object> lo =new ArrayList<>();

        addNumbers(li);
        addNumbers(ln);
        addNumbers(lo);

        System.out.println("Integer List : "+ li);
        System.out.println("Number List : " + ln);
        System.out.println("Object List : "+lo);
    }
}
