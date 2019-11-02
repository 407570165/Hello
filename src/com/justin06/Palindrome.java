package com.justin06;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String number ="";
        number =scanner.nextLine();
        char str[] =new char[number.length()];
        for (int i=0;i<number.length();i++){
            str[i]=number.charAt(i);
        }
        boolean isTrue =true;
        int low =0;
        int high=str.length-1;
        if (number == String.valueOf(0)){
            isTrue=true;
        }
        else
        while (high>low){
            if (str[low]==str[high]){
                isTrue =true;
                high--;
                low++;
            }else
                isTrue=false;
                break;
        }
        if (isTrue){
            System.out.println(number+" is palindrome");
        }
    }
}
