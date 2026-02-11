package com.kovanslab.intern.enums;
enum Dayz{
    MONDAY("Monday",true),
    TUESDAY("Tuesday",true),
    WEDNESDAY("Wednesday",true),
    THURSDAY("Thursday",true),
    FRIDAY("Friday",true),
    SATURDAY("Saturday",false),
    SUNDAY("Sunday",false);

    private String fullName;
    private boolean working;

    Dayz(String fullName , boolean working)
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
public class ComplexState {

    public static void main(String[] args)
    {
        Dayz today = Dayz.SUNDAY;

        System.out.println("Today is " + today);
        System.out.println(today.getName());
        System.out.println(today.isWorking());
    }
}
