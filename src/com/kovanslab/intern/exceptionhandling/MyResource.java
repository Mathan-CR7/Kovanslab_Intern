package com.kovanslab.intern.exceptionhandling;

public class MyResource implements AutoCloseable
{
    public void use()
    {
        System.out.println("The Resource is being used");
    }

    public void close()
    {
        System.out.println("The Resource is Closed");
    }

    public static void main(String[] args)
    {
        try(MyResource r =new MyResource())
        {
            r.use();
        }
    }
}


