package sample;
//02-6
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Practice2 {
    public static void main(String[] args) {
       Scanner scanner =new Scanner(System.in);
       int number =scanner.nextInt();
       int answer =1;
       while (number%10!=0){
           answer=answer*(number%10);
           number=number/10;
       }

        System.out.println(answer);





        /* Scanner scanner=new Scanner(System.in);
        int target =scanner.nextInt();
        int answer=1;
        while (target!=0){
            answer =answer*(target%10);
            target=target/10;
        }
        System.out.println(answer);*/
    }
}
