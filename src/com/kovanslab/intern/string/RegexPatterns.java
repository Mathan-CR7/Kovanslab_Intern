package com.kovanslab.intern.string;
import java.util.regex.*;
public class RegexPatterns {
    public static void testCase(String regex, String input)
    {
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);

        boolean found=false;

        while(m.find())
        {
            System.out.println("Matched -> " + m.group());
            found=true;
        }

        if(!found)
        {
            System.out.println("Not Matched");
        }


    }
    public static void main(String[] args) {
        {
            // Any Single Character
            testCase("a.c","aec avc ac");

            // Zero or More
            testCase("ab*","a ab abbb b ");

            // One or More
            testCase("ab+","ab abbb a");

            // Optional Remove the previous character
            testCase("colou?r","color colour");

            // Starting Index
            testCase("^Hii","Hii_All \n SayHii");

            // Ending Index
            testCase("end$","the end");

            //d Digit
            testCase("\\d+","Order number 45");

            //w Word
            testCase("\\w+","java_progarming java@programming");

            //charset
            testCase("[a,e,i,o,u]","mathan prashath");

            //Exact Count
            testCase("\\d{10}","6789045637 \n 74hfunr838");
        }
    }
}
