package com.justin;
//如何找筆輸入大的質數
import java.math.BigInteger;
import java.util.Scanner;

public class Gcd {
    public static void main(String[] args) {
        int m =0;
        int n =0;
        int max =0;
        boolean flag =true;
        Scanner scanner =new Scanner(System.in);
        n=scanner.nextInt();
        m=scanner.nextInt();
        BigInteger bi =new BigInteger(String.valueOf(n));
        BigInteger bin =new BigInteger(String.valueOf(m));
        for (int i =2;i<=m;i++){
            if (m%i==0&&n%i==0){
                max =i;
            }
        }
        System.out.println(max);
        for (int j =0;j<4;j++){
            flag =true;
        }
    }
}
