package com.recursivef;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //recursivefunction
        Scanner userInput = new Scanner(System.in);
        System.out.print("Input: ");
        int x = userInput.nextInt();
        printNilai(x);
        int x2 = addSum(x);
        System.out.println(x2);
        int x3 = fibonacciSequence(x);
        System.out.println("fibo "+x+"= "+x3);
        userInput.close();
    }
    private static void printNilai(int inputX){
        System.out.println("Input: "+inputX);
        inputX--;
        if(inputX<=0){
            return;
        }
        printNilai(inputX);
    }
    private static int addSum(int inputX){
        if(inputX<=0){
            return inputX;
        } else {
            return inputX + addSum(--inputX);
        }
    }
    private static int fibonacciSequence(int inputX){
        if(inputX==0||inputX==1){
            return inputX;
        } else {
            return fibonacciSequence(inputX-1)+fibonacciSequence(inputX-2);
        }
    }
}
