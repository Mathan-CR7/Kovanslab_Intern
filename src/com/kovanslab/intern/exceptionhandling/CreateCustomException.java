package com.kovanslab.intern.exceptionhandling;
public class CreateCustomException {
    public static void main(String[] args) {

        double bal=800,withdraw=1000;

        try
        {
            if(bal<withdraw)
            {
                throw new InSufficientBalanceException(withdraw-bal);
            }
        }

        catch(InSufficientBalanceException e)
        {
            System.out.println("Insufficient Balance");
        }
    }
}

class InSufficientBalanceException extends Exception
{
    double amount;
    InSufficientBalanceException(double amt)
    {
        amount=amt;
    }
}