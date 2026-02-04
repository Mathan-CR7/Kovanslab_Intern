package com.kovanslab.intern.instancecontrol;

class AppConfig {
    private static AppConfig obj;

    private AppConfig()
    {
        System.out.println("Object Created Successfully");
    }
    public static AppConfig getInstance()
    {
        if(obj==null)
        {
            obj=new AppConfig();
        }
        return obj;
    }
}
public class Singleton
{
    public static void main(String[] args)
    {
        AppConfig d1 = AppConfig.getInstance();
        AppConfig d2 = AppConfig.getInstance();

        System.out.println(d1==d2);
    }
}
