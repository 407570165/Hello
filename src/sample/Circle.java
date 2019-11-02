package sample;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double x =scanner.nextDouble();
        double y =scanner.nextDouble();
        double dist =Math.sqrt(x*x+y*y);
        if (dist<=10){
            System.out.println("("+x+","+y+") "+"is in the circle");
        }else
            System.out.println("("+x+","+y+") "+"is not in the circle");
    }
}
