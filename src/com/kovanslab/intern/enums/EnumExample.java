package com.kovanslab.intern.enums;
enum Day
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}


public class EnumExample
{
    public static void main(String[] args)
    {
        Day today = Day.MONDAY;
        System.out.println("Today is " + today);

        switch(today)
        {
            case MONDAY :
                System.out.println("Week start");
                break;

            case FRIDAY :
                System.out.println("Last Working day");
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println("Weekend Vibes");
                break;
            default:
                System.out.println("Working Day");
                break;
        }
    }
}