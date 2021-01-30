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
        userInput.close();
    }
    private static void printNilai(int inputX){
        System.out.println("Input: "+inputX);
        inputX--;
        if(inputX==0 || inputX<0){
            return;
        }
        printNilai(inputX);
    }
    private static int addSum(int inputX){
        // int inputXn = inputX-1;
        if(inputX==0||inputX<0){
            return inputX;
        } else {
            return inputX + addSum(--inputX);
        }
    }
}
