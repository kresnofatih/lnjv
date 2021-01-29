package com.lrnloop;

public class Main {
    public static void main(String[] args){
        int a = 20;
        int y = addFive(a);
        // System.out.println(y);
        printFiveTimes(y);
    }
    private static void printFiveTimes(int inputX){
        for(int i=1; i<=5; i++){
            System.out.println(inputX);
        }
    }
    private static int addFive(int inputX){
        return (inputX + 5);
    }
}
