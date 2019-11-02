package com.justin;
//網頁上位數太大沒辦法顯示
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);
    while (scanner.hasNext()){
        int even =0;
        int odd =0;
        String number =scanner.next();
        if (number.equals("0")){
            break;
        }
        else
            for (int i =0;i<number.length();i++){
                if (i%2==0){
                    even =even +number.charAt(i)-48;
                }else
                odd =odd +number.charAt(i)-48;
            }

        if ((even-odd)%11==0){
            System.out.println(number+" is a multiple of 11.");
        }else
        System.out.println(number+" is not a multiple of 11.");
    }


        /*Scanner scanner = new Scanner(System.in);
        int even = 0;
        int odd = 0;
        while (scanner.hasNext()){
            String number =scanner.next();
            if (number.equals("0")){
                break;
            }else
                for (int i = 0; i <number.length(); i++) {
                    if (i%2==0){
                        even =even+number.charAt(i)-48;
                    }
                    else
                        odd =odd +number.charAt(i)-48;
                }
                if ((even-odd)%11==0){
                    System.out.println(number+" "+"is a multiple of 11.");
                }else
                    System.out.println(number+" "+"is not a multiple of 11.");
        }*/
    }
}
