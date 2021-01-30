package com.arraylrn;

import java.util.Arrays;

public class Twode {
    public static void main(String[] args){
        // multidimensional array🌋
        int[][] array2d = {
            {1,2},
            {3,4}
        };
        System.out.println(Arrays.deepToString(array2d));
        
        //declare new 2d-array
        int[][] array2d2 = new int[5][4];
        System.out.println(Arrays.deepToString(array2d2));
        
        // System.out.print("hello");
        // loop print array2d🚲
        for(int i=0; i<array2d2.length; i++){
            System.out.println(Arrays.toString(array2d2[i]));
        }
        for(int[] row : array2d){
            System.out.print("[");
            for(int val : row){
                System.out.print(val+",");
            }
            System.out.print("]\n");
        }
        System.out.print("hello");
    }
}
