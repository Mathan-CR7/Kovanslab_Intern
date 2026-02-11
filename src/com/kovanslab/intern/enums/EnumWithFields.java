package com.kovanslab.intern.enums;
enum Days{
    MONDAY("Monday",true),
    TUESDAY("Tuesday",true),
    WEDNESDAY("Wednesday",true),
    THURSDAY("Thursday",true),
    FRIDAY("Friday",true),
    SATURDAY("Saturday",false),
    SUNDAY("Sunday",false);

    private String fullName;
    private boolean working;

    Days(String fullName , boolean working)
    {
        this.fullName = fullName;
        this.working = working;
    }

    public String getName()
    {
        return fullName;
    }

    public boolean isWorking()
    {
        return working;
    }
}
public class EnumWithFields {

    public static void main(String[] args)
    {
        Days today = Days.SUNDAY;

        System.out.println("Today is " + today);
        System.out.println(today.getName());
        System.out.println(today.isWorking());
    }
}
