package com.kovanslab.intern.genericsandwildcards;
import java.util.*;

public class UnboundedWildCardsExample {

    public static void printList(List<?> list)
    {
        System.out.println("Printing List : ");

        for(Object obj :list)
        {
            System.out.println(obj);
        }
    }

    public static void main(String[] args) {
        List<Integer> intList =List.of(1,2,3);
        List<String> stringList = List.of("A","B","C");
        List<Double> doubleList =List.of(3.5,4.5,6.5);

        printList(intList);
        printList(stringList);
        printList(doubleList);
    }
}
