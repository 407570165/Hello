package com.practice;

public class Increment {
    public static void main(String[] args) {
            printNumber(50);
    }
    public static void printNumber(int numberofPrimes){
        int numberline =10;
        int number =2;
        int count=0;
        while (count<numberofPrimes){
            if (isPrime(number)){
                count++;
                if (count%numberline==0){
                    System.out.printf("%-5s\n",number);
                }else
                    System.out.printf("%-5s",number);
            }
            number++;
        }
    }
    public static boolean isPrime(int number){
        for (int i =2;i<=number/2;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}

