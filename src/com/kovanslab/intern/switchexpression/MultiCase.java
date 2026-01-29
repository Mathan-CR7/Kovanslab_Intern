package com.kovanslab.intern.switchexpression;
import java.util.*;
public class MultiCase {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int day=sc.nextInt();
        String dayType = switch (day) {
            case 6, 7 -> {
                System.out.println("Relax");
                yield "Weekend";
            }
            default -> {
                System.out.println("Work");
                yield "Weekday";
            }
        };

        System.out.println(dayType);

    }
}
