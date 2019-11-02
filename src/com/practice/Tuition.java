package com.practice;

public class Tuition {
    public static void main(String[] args) {
        double initial =10000;
        int count =1;
        while (initial<20000){
            initial =initial*1.07;
            count++;
        }
        System.out.println(count);
    }
}
