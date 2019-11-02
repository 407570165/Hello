package sample;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        int i,j,k;
        Scanner scanner =new Scanner(System.in);
        int row =scanner.nextInt();
        for (i=1;i<=row;i++){
            for (j=i;j<=row;j++) {
                System.out.print(" ");
            }
            for (k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (i=2;i<=row;i++){
            for (k=1;k<=i;k++){
                System.out.print(" ");
            }
            for (j=i;j<=row;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }

    }
}
