package com.strhandle;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        // learn how to handle strings in Java
        String kataString = "hello";
        char[] kataChar = {'h', 'e', 'l', 'l', 'o'};
        System.out.println(kataString);
        System.out.println(Arrays.toString(kataChar));
        System.out.println(kataChar[3]);
        System.out.println(kataString.charAt(3));
        
        // alter string
        kataChar[0] = 'c';
        
        // kataString.charAt(0) = "c";
        kataString = "test";
        System.out.println(kataString);

        String str1 = "test";
        String str2 = "test";
        String str3 = "hello";
        //same value means same address
        System.out.println("str1 "+Integer.toHexString(System.identityHashCode(str1)));
        System.out.println("str2 "+Integer.toHexString(System.identityHashCode(str2))); 
        //different value means diferent address
        System.out.println("str3 "+Integer.toHexString(System.identityHashCode(str3)));
        
        //create string with same value but different address
        String str4 = new String("hello");
        System.out.println("str4 "+Integer.toHexString(System.identityHashCode(str4)));
    }
}
