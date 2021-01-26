package com.tutop;

public class Main {
    public static void main(String[] args){
        // arithmatic operations
        int var1 = 5;
        int var2 = 3;
        int res1;
        res1 = var1 + var2;
        System.out.println(var1 + "+" + var2 + "=" + res1);
        res1 = var1 - var2;
        System.out.println(var1 + "-" + var2 + "=" + res1);
        res1 = var1 * var2;
        System.out.println(var1 + "x" + var2 + "=" + res1);
        res1 = var1 / var2;
        System.out.println(var1 + "/" + var2 + "=" + res1);
        res1 = var1 % var2;
        System.out.println(var1 + "%" + var2 + "=" + res1);
        float var3 = 5.7f;
        float var4 = 3.2f;
        float res2;
        res2 = var3 + var4;
        System.out.println(var3 + "+" + var4 + "=" + res2);
        res2 = var3 - var4;
        System.out.println(var3 + "-" + var4 + "=" + res2);
        res2 = var3 * var4;
        System.out.println(var3 + "x" + var4 + "=" + res2);
        res2 = var3 / var4;
        System.out.println(var3 + "/" + var4 + "=" + res2);
        res2 = var3 % var4;
        System.out.println(var3 + "%" + var4 + "=" + res2);
        // arithmetics operations don't work on booleans
        // boolean var5 = true;
        // boolean var6 = false;
        // boolean res3;
        // res3 = var5 + var6;
        // System.out.println(var5 + "+" + var6 + "=" + res3);
        int var5 = 238;
        System.out.println(var5);
        long var6 = 765789;
        System.out.println((int) var6/var5);
        System.out.println(Integer.MAX_VALUE);
        byte var7 = (byte) var6;    // please check the max/min value when downgrading numeric data types
        System.out.println(var7);
        // int var8 = 1;
        // System.out.println(var8);
        // boolean var9 = (boolean) var8;
    }
}
