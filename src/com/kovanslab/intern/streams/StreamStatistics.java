package com.kovanslab.intern.streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamStatistics {
    public static void main(String[] args) {
        List<Integer> numbers= new Random().ints(100,0,500).boxed().collect(Collectors.toList());

        IntSummaryStatistics s = numbers.stream().mapToInt(Integer:: intValue).summaryStatistics();

        System.out.println("Count : " + s.getCount());
        System.out.println("Max : " + s.getMax());
        System.out.println("Min : " + s.getMin());
        System.out.println("Sum : " + s.getSum());
        System.out.println("Average : " +s.getAverage());

    }
}
