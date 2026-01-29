package com.kovanslab.intern.varargs;

public class VariableArguments {
    public static void main(String[] args) {
        sum("mathan",60,70,80);
    }

    public static void sum(String name,int... marks)
    {
        System.out.println(name);

        for(int i : marks)
        {
            System.out.print(i+" ");
        }

    }
}
