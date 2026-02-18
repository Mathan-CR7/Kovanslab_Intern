package com.kovanslab.intern.exceptionhandling;
import java.io.*;

public class MultipleTryCatch{
    public static void main(String[] args)
    {
        int a=10;
        int b=0;
        int c;
        String s= "Hello";
        int size=-5;
        try{
            int arr[] =new int[size];
            c=a/b;
            System.out.println(s.charAt(7));
        }
        catch(NegativeArraySizeException e)
        {
            System.out.println("Array index is negative");
        }

        catch(ArithmeticException  | StringIndexOutOfBoundsException e)
        {
            System.out.println("Exception Occured");
        }


        try{
            int arr[] = {1,23,34};
            System.out.println(arr[4]);
        }


        catch(NullPointerException e)
        {
            System.out.println("Array is Null");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array Index out of bounds");
        }

        File file =new File("abs.txt");
        try
        {
            FileInputStream fi=new FileInputStream(file);
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File Not Found");
            e.printStackTrace();
        }

        finally{
            System.out.println("Code Executed Successflly");
        }
    }
}
