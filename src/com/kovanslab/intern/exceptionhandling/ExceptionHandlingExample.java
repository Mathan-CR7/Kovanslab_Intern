package com.kovanslab.intern.exceptionhandling;
public class ExceptionHandlingExample
{
    public static void main(String[] args)
    {
        int a=10;
        int b=0;
        int c=0;
        try
        {
             c=a/b;
            throw new NullPointerException("example");
        }
        catch(ArithmeticException e)
        {
            System.out.println("b value is Zero");
        }
        catch(NullPointerException e)
        {
            System.out.println("Nullpointer exception happens");
        }


    }
}