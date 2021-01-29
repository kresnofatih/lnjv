package com.lrnloop;

public class Main {
    public static void main(String[] args){
        int a = 20;
        int y = addFive(a);
        // System.out.println(y);
        printFiveTimes(y);
        printTriangle(y);
    }
    private static void printFiveTimes(int inputX){
        for(int i=1; i<=5; i++){
            System.out.println(inputX);
        }
    }
    private static void printTriangle(int inputX){
        for(int i=1; i<=inputX; i++){
            for(int j=1; j<=i; j++){
                if(j==i){
                    System.out.println("o");
                } else {
                    System.out.print("o");
                }
            }
        }
    }
    private static int addFive(int inputX){
        return (inputX + 5);
    }
}
