package com.justin;

import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
            Scanner scanner =new Scanner(System.in);
            int number = scanner.nextInt();
            int count =0;
            int k =2;
            boolean isPrime =true;
        int stack[]=new int[100];
                for (int x =2;x<number/2;x++){
                    if (number%x==0){
                        isPrime=false;
                        break;
                    }
                }

            if (isPrime){
             stack[0]=1;
                System.out.println(stack[0]+" "+number);
            }
            else
            while (isPrime==false){//怎麼繼續除I
                if (number%k==0){
                    number =number/k;
                    stack[count]=k;
                    count++;
                }
                else
                    k++;
                if (number==1){
                    break;
                }
            }
            for (int i =0;i<count;i++){
                if (i==0){
                    System.out.print(stack[i]);
                }else
                    System.out.print(" "+stack[i]);
                if (i==count-1){
                    System.out.println();
                }
            }
        }
    }

