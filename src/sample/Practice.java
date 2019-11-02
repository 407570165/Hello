package sample;

import java.awt.*;
import java.util.Scanner;

//practice-02
public class Practice {
    public static void main(String[] args) {
        /*for(int i=1;i<10;i++){
            for(int j =1;j<10;j++){
                        if (j!=9)
                        System.out.printf("%d * %d = %2d ",i, j, i * j);
                        else {
                            System.out.printf("%d * %d = %2d",i, j, i * j);
                        }
                    }
                        System.out.println("");
            }*/
            for (int i=1;i<5;i++){
                for (int j=8-i;j>i;j--) {
                    System.out.print(" ");

                    for (int k =1;k<=2*i-1;k++){
                        System.out.print("*");
                    }
            }System.out.println("");
            }


    }
    }

