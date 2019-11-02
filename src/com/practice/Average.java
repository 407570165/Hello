package com.practice;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double sum =0.0;
        int n =scanner.nextInt();
        double[] stack=new double[n];
        for (int i=0;i<stack.length;i++){
            stack[i]=scanner.nextDouble();
            sum=sum+stack[i];
        }
        double average=sum/n;
        int count =0;
        for (int i=0;i<n;i++){
            if (stack[i]<average){
                System.out.print(stack[i]);
                count++;
            }
        }
        System.out.println(count);
    }
}
