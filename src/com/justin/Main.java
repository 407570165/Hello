package com.justin;

public class Main {
    private static double cal(char op,double p1, double p2){
        switch (op){
            case '+':
                return p1+p2;
            case '-':
                return p1-p2;
            case '*':
                return p1*p2;
            case '/':
                return p1/p2;
            default:throw new ArithmeticException(op+ "no defined");
        }
    }
}
