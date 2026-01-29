package com.kovanslab.intern.ternary;
import java.util.*;
public class Ternary {
    public static void main(String[] args)
    {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        String res=(num > 0) ? "Positive"
                :(num < 0)  ? "Negative"
                :"Zero";
        System.out.print(res);
    }

}
