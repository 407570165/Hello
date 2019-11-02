package com.practice;
//印公因數
import java.math.BigInteger;
import java.util.Scanner;

public class findGCD {

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int a =0;
        int b =0;
        int gcd =0;
        while(scanner.hasNext()) {


        BigInteger x1 = scanner.nextBigInteger();
        BigInteger x2 =scanner.nextBigInteger();
        BigInteger x3=x1.gcd(x2);
        /*int k =2;
        while (k<=a&&k<=b){
            if (a%k==0&&b%k==0){
                gcd =k;
            }
           k++;
        }
        System.out.println(gcd);*/
        System.out.println(x3);
        int count =0;
        while (count<5){
            x3 =x3.nextProbablePrime();
            if (count==0) {
                System.out.print(x3);
                count++;
            }
            else {
                System.out.print(" " + x3);
                count++;
            }

        }
            System.out.println("");
        }
    }
}
