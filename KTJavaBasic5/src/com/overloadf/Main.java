package com.overloadf;

public class Main {
    public static void main(String[] args){
        printAngka(8);
        printAngka(10.5f);
        printAngka(10.78d);
        printAngka(addTwo(3));
        printAngka(addTwo(3.7f));
        printAngka(addTwo(3f, 3.2f));
    }
    private static float addTwo(float inputX, float inputX2){
        return inputX2+inputX+2;
    }
    private static float addTwo(float inputX){
        return inputX+2;
    }
    private static int addTwo(int inputX){
        return inputX+2;
    }
    private static void printAngka(double inputXd){
        System.out.println("int value: "+inputXd);
    }
    private static void printAngka(float inputXf){
        System.out.println("int value: "+inputXf);
    }
    private static void printAngka(int inputXi){
        System.out.println("int value: "+inputXi);
    }
}
