package com.kovanslab.intern.matix;

public class MatrixMultipication {
    public static void main(String[] args)
    {
        int[][] arr1 =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                };

        int[][] arr2 =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                };

        int[][] res =new int[3][3];

        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                res[i][j]=0;
                for(int k=0;k<3;k++)
                {
                    res[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("MATRIX MULTIPICATION : ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(res[i][j] + " ");
            }
            System.out.println();
        }
    }
}
