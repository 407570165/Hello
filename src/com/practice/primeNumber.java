package com.practice;

public class primeNumber {
    public static void main(String[] args) {
        boolean isPrime =true;
            int println =10;
            int total =50;
            int count =0;
            int prime =2;
            while (count <total){
                isPrime=true;
                for (int i =2;i<=prime/2;i++){
                    if (prime%i==0){
                        isPrime=false;
                        break;
                    }
                }
                if (isPrime) {
                    count++;
                    if (count%println==0){
                        System.out.println(prime);

                    }
                    else
                        System.out.print(prime+" ");
                }
                prime++;
            }
    }
}
