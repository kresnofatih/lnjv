package com.lrnloop;

public class Main {
    public static void main(String[] args){
        int a = 1;
        while(a<=10){
            System.out.println(a);
            a++;
        }
        //
        int b = 1;
        do {
            System.out.println(b);
            b++;
        }while(b<=10);
        //
        for(int c=1; c<=10; c++){
            System.out.println(c);
        }
        a = 0;
        while(a<=10){
            a++;
            if(a==5){
                continue;
            }
            if(a==7){
                continue;
            }
            if(a==9){
                return;
            }
            System.out.println(a);
        }
    }
}
