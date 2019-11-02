package com.practice;

import java.util.Scanner;

public class inverse {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number =0;
        number =scanner.nextInt();
        boolean isPrime =true;
        for (int i =2;i<number;i++){
            isPrime=true;
            for (int j=2;j<i;j++){
                if (i%j==0){
                    isPrime =false;
                    break;
                }
            }
            boolean inverse =true;
           String str = String.valueOf(i);
            int low=0;
            int high =str.length()-1;
            while (low<high){
               if (str.charAt(low)!=str.charAt(high)) {
                   inverse = false;
                   break;
               }
                low++;
               high--;
            }
            if (isPrime&&inverse){
                System.out.print(i+" ");
            }
        }
    }
}
