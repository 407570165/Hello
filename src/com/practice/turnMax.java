package com.practice;

public class turnMax {
    public static void PrintMax(double... numbers){
        if (numbers.length==0){
            System.out.println("no no");
            return;
        }
        double result =numbers[0];
        double max = 0;
        for (int i=1;i<numbers.length;i++){
            if (result<numbers[i]){
                result=numbers[i];
            }
        }
        System.out.println(result);
    }
    public static void main(String[] args) {
            PrintMax(34,3,2,56.5);
            PrintMax(new double[]{
                    1,2,3
            });
    }
}
