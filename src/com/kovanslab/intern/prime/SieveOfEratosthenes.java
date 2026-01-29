package com.kovanslab.intern.prime;

public class SieveOfEratosthenes {
    public static void main(String[] args) {
        int n=1000;
        boolean[] prime = new boolean[n+1];

        for(int i=2;i<=n;i++)
        {
            prime[i] =true;
        }

        for(int i=2;i*i<=n;i++)
        {
            if(prime[i])
            {
                for(int j =i*i;j<=n; j +=i)
                {
                    prime[j]=false;
                }
            }
        }
        System.out.println("Prime Numbers Upto 1000 : ");
        for(int i=2;i<=n;i++)
        {
            if(prime[i])
            {
                System.out.print(i+" ");
            }
        }
    }
}
