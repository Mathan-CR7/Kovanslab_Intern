package com.kovanslab.intern.interfaceexample;

interface Calculator
{
    int add(int a,int b);
}

public class FunctionalInterface {
    public static void main(String[] args) {
        {
            Calculator c = (a,b) -> a+b;
            int res = c.add(10,20);
            System.out.println(res);
        }
    }
}
