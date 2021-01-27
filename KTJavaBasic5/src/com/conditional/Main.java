package com.conditional;

public class Main {
    public static void main(String[] args){
        int a = 10;
        if(a>6){
            System.out.println("atas");
        } else if(a>2 && a<=6){
            System.out.println("mid");
        }else {
            System.out.println("bwh");
        }
    }
}
