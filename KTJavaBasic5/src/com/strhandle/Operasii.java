package com.strhandle;

import java.lang.StringBuilder;

public class Operasii {
    public static void main(String[] args){
        String kalimat = "saya fatih";
        System.out.println(kalimat.charAt(3));
        String kata = kalimat.substring(3, 7);
        System.out.println(kata);
        int jum = 20;
        String kalimat2 = kata + jum;
        System.out.println(kalimat2);
        System.out.println("kalimat "+Integer.toHexString(System.identityHashCode(kalimat)));
        System.out.println("kalimat2 "+Integer.toHexString(System.identityHashCode(kalimat2)));
        System.out.println("kata "+Integer.toHexString(System.identityHashCode(kata)));
        //replace
        String kalimat4 = kalimat.replace("fatih", "irhamzaki");
        System.out.println(kalimat4);
        System.out.println(kalimat);
        // stringbuilder
        StringBuilder builder = new StringBuilder("halo");
        System.out.println("strbldr: "+ builder);
        // format string
    }
}
