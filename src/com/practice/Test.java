package com.practice;
//為甚麼超過五還會繼續印
public class Test {
    public static void main(String[] args) {
        int i =125;
        boolean flag =true;
        int count =0;
        int total =5;
        int number =2;
        while (count<5){
            flag=true;
            for ( i=125;i<1000;i++){
                for (int j =2;j<i;j++){
                    if (i%j==0) {
                        flag = false;
                        break;
                    }
                }
                if (flag){
                    System.out.print(i+" ");
                    ++count;
            }
            }
        }

    }
}
