package com.practice;

public class Grade {
    public static void printGrade(double score){
        if (score>90){
            System.out.println("a");
        }
        else if (score>=80){
            System.out.println("b");
        }
        else if (score>=70){
            System.out.println("c");
        }
        else if (score>=60){
            System.out.println("d");
        }else
            System.out.println("f");

    }
    public static void main(String[] args) {
        printGrade(90);
    }
}
