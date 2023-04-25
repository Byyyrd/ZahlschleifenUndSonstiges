package com.company;

public class Nr5 {
    // a)
    public static void printEvenNumbers(int start, int end){
        for (int i = start; i <= end; i++){
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    // b)
    public static int sumUpThree(int von, int bis){
        int result = 0;
        for (int i = von;i <= bis;i++){
            if (i % 3 == 0){
                result += i;
            }
        }
        return result;
    }
    // c)
    public static void starThing(int width, int height){
        for (int i = 0;i <= height;i++){
            if (i % 2== 0){
                System.out.print("*");
            }else {
                for (int j = 0; j <= width; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
