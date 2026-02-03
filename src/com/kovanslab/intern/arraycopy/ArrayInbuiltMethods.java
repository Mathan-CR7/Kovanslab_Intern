package com.kovanslab.intern.arraycopy;

import java.util.*;
public class ArrayInbuiltMethods {

    public static void main(String[] args) {
        {
            int[] arr  ={10,1,3,5,6,11};
            int[] arr2 ={10,1,3,5,6,11};
            int[][] num =
                    {
                            {3,4,5},
                            {6,7,8},
                    };
            Arrays.sort(arr);
            System.out.println("Sorted Array : " + Arrays.toString(arr)); // Sorting Array

            // Printing Array values for Multidimensional array

            System.out.println("2D array : " + Arrays.toString(num)); // it show the memory address
            System.out.println("2D array : " + Arrays.deepToString(num)); // it display the actual values in 2D array

            // To check if two array's are equal

            System.out.println("Is Array Equal : " + Arrays.equals(arr,arr2));

            // Array Binary Search
            // Array must be Sorted
            System.out.println(Arrays.binarySearch(arr,3));

            // Arrays copy method

            int[] copy = Arrays.copyOf(arr,5);
            System.out.println(Arrays.toString((copy)));

            // Arrays Fill

            Arrays.fill(arr2,0);
            System.out.println(Arrays.toString(arr2));

        }
    }
}
