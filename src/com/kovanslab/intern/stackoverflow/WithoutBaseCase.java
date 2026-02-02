package com.kovanslab.intern.stackoverflow;

public class WithoutBaseCase {

    public static void number(int n)
    {
        System.out.println(n);
        number(n+1);
    }
    public static void main(String[] args)
    {
        number(1);
    }
}
