package com.company;

public class Nr3 {
    // a)
    public static void rectangleStars(int width, int height){
        for (int i = 0;i <= height;i++){
            for (int j = 0; j <= width;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    // b)
    public static void rectangleStarsSave(int width, int height){if (width > 0 && height > 0) rectangleStars(width,height);}


    // c)
    public static void triangleStars(int width){
        for (int i = 1;i <= width;i++){
            for (int j = 0; j < i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
