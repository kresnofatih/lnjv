package com.arraylrn;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        //learning array
        int[] numKey = {2,1,4,5};
        System.out.println(numKey);
        for(int i=0; i<numKey.length; i++){
            System.out.println(numKey[i]);
        }
        System.out.println(Arrays.toString(numKey));
        float[] numFloat = new float[3];
        numFloat[2]=2.2f;
        System.out.println(Arrays.toString(numFloat));
    }
}
