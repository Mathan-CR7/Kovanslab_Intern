package com.kovanslab.intern.genericsandwildcards;
import java.util.*;
public class UpperBoundWildCardExample {
    public static double sum(List<? extends Number> list)
    {
        double total=0;
        for(Number obj :list)
        {
            total += obj.doubleValue();
        }
        return total;
    }

    public static void main(String[] args)
    {
        List<Integer> intList = List.of(4,3,6);
        List<Double> doubleList =List.of(4.5,2.3,6.5);
        List<Float> floatList =List.of(3.2f,7.6f);

        System.out.println(sum(intList));
        System.out.println(sum(doubleList));
        System.out.println(sum(floatList));
    }
}



// List<Integer> intList = new ArrayList<>();
// List<? extends Number> list = intList;

// list.add(10);
// list.add(2.5);
//Integer x = intList.get(1);

// Object obj = list.get(0); This is allowded