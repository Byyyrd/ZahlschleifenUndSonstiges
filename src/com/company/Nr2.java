package com.company;

public class Nr2 {
    // a)
    public static void  printSomeNumbers(){
        for (int i = 6; i < 24;i++){
            System.out.println(i);
        }
    }
    // b)
    public static void  printNumbers(int start,int end){
        for (int i = start; i <= end;i++){
            System.out.println(i);
        }
    }
    // c)
    public static int sumUp(int start,int end){
        int result = 0;
        for (int i = start; i <= end;i++){
            result += i;
        }
        return result;
    }
    // d)
    public static int powerOfTwo(int p){
        if (p >= 0){
            int result = 1;
            for (int i = 0; i < p;i++){
                result *= 2;
            }
            return result;
        }else {
            throw new IllegalArgumentException("Number must be greater than or equal to zero");
        }
    }
    // e)
    public static int sumUpPowerOfTwo(int n){
        int result = 0;
        for (int i = 0;i <= n;i++){
            result += powerOfTwo(i);
        }
        return result;
    }
}
