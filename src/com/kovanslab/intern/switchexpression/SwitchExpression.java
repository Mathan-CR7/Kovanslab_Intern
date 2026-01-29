package com.kovanslab.intern.switchexpression;
import java.util.*;
public class SwitchExpression {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        String name =switch(day)
        {
            case 1 -> "Monday";
            case 2 -> "Friday";
            default -> "Invalid";

        };
        System.out.println(name);

    }

}
