package com.kovanslab.intern.inheritance;


interface Learner
{
    void learn();
}

interface SportsPlayer
{
    void play();
}

class CollegeStudent implements Learner,SportsPlayer
{
    public void learn()
    {
        System.out.println("College Student is a Learner");
    }

    public void play()
    {
        System.out.println("College Student is also a Sports Player");
    }
}

public class MultipleInheritance {
    public static void main(String[] args)
    {
        CollegeStudent cs= new CollegeStudent();
        cs.learn();
        cs.play();

    }
}
