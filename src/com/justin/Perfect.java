package com.justin;

public class Perfect {
    public static void main(String[] args) {

        int sum =0;
        for (int i =1;i<10000;i++){
            sum =0;
            for (int j =1;j<i;j++){
                if (i%j==0){
                    sum =sum +j;
                }
            }
            if (sum ==i){
                System.out.println(i);
            }
        }
    }
}