package com.conditional;

public class Main {
    public static void main(String[] args){
        int a = 10;
        if(a>6){
            if(a%2==0){
                System.out.println("genap");
            } else {
                System.out.println("ganjil");
            }
            System.out.println("atas");
        } else if(a>2 && a<=6){
            if(a%2==0){
                System.out.println("genap");
            } else {
                System.out.println("ganjil");
            }
            System.out.println("mid");
        }else {
            if(a%2==0){
                System.out.println("genap");
            } else {
                System.out.println("ganjil");
            }
            System.out.println("bwh");
        }
    }
}
