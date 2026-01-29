package com.kovanslab.intern.matix;

public class SpiralTraversal {
    public static void main(String[] args) {
        int[][] spiral =
                {
                        {1,2,3},
                        {4,5,6},
                        {7,8,9},
                };

        int top=0;
        int bottom= spiral.length-1;
        int left=0;
        int right=spiral[0].length-1;


        while(top<=bottom && left <= right)
        {
            for(int i=left;i<=right;i++)
            {
                System.out.print(spiral[top][i] + " ");
            }
            top ++;

            for(int i=top;i<=bottom;i++)
            {
                System.out.print(spiral[i][right] + " ");
            }
            right --;

            if(top<=bottom)
            {
                for(int i=right;i>=left;i--)
                {
                    System.out.print(spiral[bottom][i]+" ");
                }
                bottom --;
            }

            if(left <= right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    System.out.print(spiral[i][left] + " ");
                }
                left ++;
            }


        }
    }
}
