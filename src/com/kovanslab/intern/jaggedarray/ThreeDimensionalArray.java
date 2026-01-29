package com.kovanslab.intern.jaggedarray;

public class ThreeDimensionalArray {
    public static void main(String[] args) {

        int[][][] cube = {
                {
                        {1, 2},
                        {3, 4}
                },
                {
                        {5, 6},
                        {7, 8}
                }
        };

        for (int[][] layer : cube) {
            for (int[] row : layer) {
                for (int val : row) {
                    System.out.print(val + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
