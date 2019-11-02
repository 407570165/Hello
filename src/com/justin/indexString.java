package com.justin;

import java.util.Scanner;

public class indexString {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a="";
        String b="";
        a=scanner.next();
        b=scanner.next();
        String initial[]=new String[a.length()];
        String test[] =new String[b.length()];
        int local[] =new int[100];
        boolean a1 =false;
        int count =0;
        for (int i =0;i<a.length();i++){
            initial[i]= String.valueOf(a.charAt(i));
        }
        for (int i =0;i<b.length();i++){
            test[i]= String.valueOf(a.charAt(i));
        }
        for (int i =1;i<a.length();i++){
            for (int j =1;j<b.length();j++) {
                if (test[j].equals(initial[i]) && test[j -1].equals(initial[i - 1])) {
                    a1 = true;
                    local[count] = i-1;
                    count++;
                }
            }
        }
        if (a1){
            System.out.println(b+" is a substring of "+a);
            for (int i =0;i<count;i++){
                if (i==0){
                    System.out.print(local[i]);
                }else
                    System.out.print(" "+local[i]);
            }
        }
        else
            System.out.println(b+" is not a substring of "+a);
    }
}
