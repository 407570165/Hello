package com.justin;

import java.util.Scanner;

public class Natural {



    public static void main(String[] args) {
        double k =1.0;
        double total = 0;
        double e=1.0;
        double t=1.0;
        double sum=0;
        Scanner scanner =new Scanner(System.in);
        e=scanner.nextDouble();
        for (int i =1;i<=e;i++){
            t=t/i;
            k=k+t;
            }
        System.out.println(k);
        }
    }
