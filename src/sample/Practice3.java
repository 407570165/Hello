package sample;
//practice -03
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int number;
        number =scanner.nextInt();
        for (int i=2;i<number;i++){
            boolean flag =true;
            for (int j =2;j<i;j++){
                if (i%j==0){
                    flag =false;
                    break;
                }
            }
                if (flag&&i==2){
                    System.out.print(i);
                }
                else if ((flag&&i!=2)){
                    System.out.print(" "+i);
                }

        }
        System.out.println();
    }
}











        /*Scanner scanner =new Scanner(System.in);
        int number =scanner.nextInt();
        for (int i=2;i<=number;i++){
            boolean isPrime=true;

        for(int j=2;j<i;j++){
            if(i%j==0){
                isPrime=false;
                break;
            }
        }
            if (isPrime&&i==2){
                System.out.print(i);
    }
        else if(isPrime&&i!=2) {
            System.out.print(" "+i);
            }
        }
        System.out.println("");*/
  //  }//
//}
