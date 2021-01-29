package com.swt;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        String w = userInput.next();

        switch(w){
            default:
                System.out.println("salah");
                break;
            case "fatih":
                System.out.println("1");
                break;
            case "irham":
                System.out.println("2");
                break;
            case "zaki":
                System.out.println("3");
                break;
            
        }

        userInput.close();

    }
}
