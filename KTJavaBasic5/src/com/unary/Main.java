package com.unary;

public class Main {
    public static void main(String[] arg){
        //prefix 1
        int angka = 1;
        System.out.println("unary+ "+(angka)+" "+(+angka));
        System.out.println("unary- "+(angka)+" "+(-angka));
        //suffix 2
        int angka2 = 7;
        angka2++;
        System.out.println("suffix2+ "+(angka2)+" "+(angka2));
        angka2--;
        System.out.println("suffix2- "+(angka2)+" "+(angka2));
        //suffix2prefix2
        angka2=6;
        System.out.println("prefix2+ "+(angka2)+" "+(++angka2));
        angka2=6;
        System.out.println("suffix2+ "+(angka2)+" "+(angka2++));
        boolean b = true;
        System.out.println("prefix! "+(!b));
        angka2+=3;
        System.out.println(angka2);
        angka2/=3;
        System.out.println(angka2);
        angka2*=7;
        System.out.println(angka2);
        angka2-=7;
        System.out.println(angka2);
        angka2%=3;
        System.out.println(angka2);
    }
}
