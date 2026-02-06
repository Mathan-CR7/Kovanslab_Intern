package com.kovanslab.intern.pollymorphism;


class Account
{
    Account getAccount()
    {
        System.out.println("Generic Account");
        return new Account();
    }
}

class SavingsAccount extends Account
{
    SavingsAccount getAccount()
    {
        System.out.println("SavingsAccount");
        return new SavingsAccount();
    }
}

public class Covariant {
    public static void main(String[] args)
    {
        Account a= new SavingsAccount();
        Account acc= a.getAccount();
        System.out.println(acc.getClass().getSimpleName());
    }
}
