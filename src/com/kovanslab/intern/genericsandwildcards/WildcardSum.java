package com.kovanslab.intern.genericsandwildcards;
import java.util.*;

public class WildcardSum {

    public static double sumList(List<? extends Number> list) {

        double sum = 0.0;

        for(Number n : list){
            sum += n.doubleValue();
        }

        return sum;
    }

    public static void main(String[] args) {

        List<Integer> li = List.of(1,2,3,4);
        List<Double> ld = List.of(2.5,3.5,4.0);

        System.out.println(sumList(li));
        System.out.println(sumList(ld));
    }
}
