package com.kovanslab.intern.stackoverflow;

public class MutualRecursive {
    public static void A()
    {
        B();
    }
    public static void B()
    {
        A();
    }
    public static void main(String[] args) {
        {
            A();
        }
    }
}
