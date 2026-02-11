package com.kovanslab.intern.enums;
enum Opperation
{
    ADD
            {
                double apply(double x ,double y)
                {
                    return x+y;
                }
            },
    SUBTRACT
            {
                double apply(double x,double y)
                {
                    return x-y;
                }
            },
    MULTIPLY
            {
                double apply(double x,double y)
                {
                    return x*y;
                }
            };
    abstract double apply(double x ,double y);
}


public class EnumWithAbstract {
    public static void main(String[] args)
    {
        Opperation op = Opperation.MULTIPLY;
        double result =op.apply(5, 5);
        System.out.println(result);
    }
}
