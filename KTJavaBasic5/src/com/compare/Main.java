package com.compare;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int a, b;
        a = 6;
        b = 6;
        System.out.println(a+" "+b+" "+(a==b));
        a = 7;
        System.out.println(a+" "+b+" "+(a<b));
        b = 87;
        System.out.println(a+" "+b+" "+(a!=b));
        boolean c = true;
        boolean d = false;
        System.out.println("c OR d "+(c||d)); //or
        System.out.println("c AND d "+(c&&d)); //and
        System.out.println("c AND d "+(c^d)); //and

        Scanner userInput = new Scanner(System.in);

        int lebar = userInput.nextInt();
        int panjang = userInput.nextInt();

        //hitung luas persegipjg
        // int panjang = 10;
        // int lebar = 5;
        int luas = panjang*lebar;
        System.out.println(panjang+" "+lebar+" "+luas);
    }
}
