import java.util.Scanner;
//printprimenumber
public class Prime {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int number ;
       number =scanner.nextInt();
       int count = 0;
       for (int i =2;i<number;i++){
           boolean flag =true;
           for (int j =2;j<i;j++){
               if (i%j==0){
                   flag =false;
                   break;
               }
           }
           if (flag) {
               count +=  1;
               if (count%10==1){
                   System.out.print(i);
               }
               if (count%10!=1){
                   System.out.print(" "+i);
               }
               if (count%10==0){
                   System.out.println("");
               }
           }
           }
       if (count%10!=0){
            System.out.println("");
       }
















        /* Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        int cnt = 0;
        for(int i=2;i<number;i++){
            boolean flag=true;
            for (int j=2;j<i;j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
                if (flag) {
                    cnt += 1;
                    if (cnt%10==1) {
                        System.out.print(i);
                    }
                    if (cnt%10!=1){
                        System.out.print(" "+i);
                    }
                    if (cnt%10==0){
                        System.out.println("");
                    }
                }
            }
        if (cnt%10!=0){
            System.out.println("");
        }**/
        }

    }

