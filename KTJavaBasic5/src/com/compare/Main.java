package com.compare;

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
    }
}