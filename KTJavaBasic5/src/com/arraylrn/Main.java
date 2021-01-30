package com.arraylrn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //learning array

        //declaring new array manually
        int[] numKey = {2,1,4,5};
        System.out.println(numKey);
        //using length for loops
        for(int i=0; i<numKey.length; i++){
            System.out.println(numKey[i]);
        }
        // printing the whole array
        System.out.println(Arrays.toString(numKey));

        // declare new array of float
        float[] numFloat = new float[3];
        numFloat[2]=2.2f;
        // printing the whole array
        System.out.println(Arrays.toString(numFloat));

        // for each
        for(int value : numKey){
            System.out.println("numkey: "+value);
        }
        int[] numNum = Arrays.copyOf(numKey, numKey.length);
        // pass by reference, duplicate an array with same heap location
        changeArray(numKey);
        for(int value : numKey){
            System.out.println("numkey: "+value);
        }
        for(int value : numNum){
            System.out.println("numnum: "+value);
        }

    }
    private static void changeArray(int[] inputArray){
        inputArray[0] = 12;
    }
}
