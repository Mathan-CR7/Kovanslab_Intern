package com.kovanslab.intern.recursivethinking;
import java.util.*;
public class RecursivePallindrome {
    static boolean isPallindrome(String s)
    {
        if(s.length()<=1)
        {
            return true;
        }
        if(s.charAt(0)!=s.charAt(s.length()-1))
        {
            return false;
        }

        return isPallindrome(s.substring(1,s.length()-1));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        if(isPallindrome(s))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
