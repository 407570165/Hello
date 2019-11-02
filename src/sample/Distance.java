package sample;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double x1=scanner.nextDouble();
        double y1=scanner.nextDouble();
        double x2=scanner.nextDouble();
        double y2=scanner.nextDouble();
        double a=  (x1-x2);
        double b= (y1-y2);
        double tot=  Math.pow(a*a+b*b,0.5);
        System.out.println(tot);
    }
}
