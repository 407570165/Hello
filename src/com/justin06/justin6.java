package com.justin06;

import java.util.Scanner;
//06-2
public class justin6 {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number =0;
        int total=1;
        number =scanner.nextInt();
        while (number%10>0){//如果只有一個0怎麼辦
            total =total*(number%10);
            number =number/10;
        }
        System.out.println(total);
    }
}
