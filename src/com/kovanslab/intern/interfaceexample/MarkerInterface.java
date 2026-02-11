package com.kovanslab.intern.interfaceexample;

interface PremiumUser
{

}
class User implements PremiumUser{

}

public class MarkerInterface {
    public static void main(String[] args) {
        User u = new User();

        if(u instanceof PremiumUser)
        {
            System.out.println("User Is Premium");
        }
        else
        {
            System.out.println("Normal User");
        }
    }
}
