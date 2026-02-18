package com.kovanslab.intern.exceptionhandling;
import java.util.*;

public class TryWithResources {
    public static void main(String[] args) {
        int i;
        try(Scanner sc =new Scanner(System.in))
        {
            i =sc.nextInt();
        }
        System.out.println(i);

    }
}
