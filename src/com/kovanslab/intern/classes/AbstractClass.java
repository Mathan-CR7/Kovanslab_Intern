package com.kovanslab.intern.classes;


abstract class Bank{
    abstract double getInterest();
    void bankName()
    {
        System.out.println("Wellcome to Bank");
    }
}

class SBI extends Bank
{
    void bankName()
    {
        System.out.println("Wellcome to SBI");
    }
    double getInterest()
    {
        return 7.3;
    }
}

public class AbstractClass {
    public static void main(String[] args)
    {
        Bank b= new SBI();
        b.bankName();
        System.out.println(b.getInterest());
    }
}