package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen (int a, int b, int c){
        if((a >= 13 && a <= 19) ||
                (b >= 13 && b <= 19 ) ||
                (c >= 13 && c <= 19)) {
            System.out.println("One of them is teen.");
            return true;
        } else return false;
    }
    public static boolean isTeen(int d){
        if(d >= 13 && d <= 19){
            System.out.println("This is a teen.");
            return true;
        } else return false;
    }
}
