package com.practice;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Hw1 {
    public static void main(String[] args) {
        int real = 0;
        String s;
        String[] cal = new String[1000];
        Scanner scanner = new Scanner(System.in);
        s = scanner.next();
        StringTokenizer st = new StringTokenizer(s, "+,-,*,/,(,),%", true);
        int i = 0;
        while (st.hasMoreTokens()) {
            cal[i] = st.nextToken();
            if (i==0){
                System.out.print(cal[i]);
            }
            else
                System.out.print(" "+cal[i]);
            i++;
        }
    }
}
