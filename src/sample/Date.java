package sample;

import javax.print.DocFlavor;
import java.util.Scanner;

public class Date {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int month =scanner.nextInt();
        int year =scanner.nextInt();
        String monthName=" ";
        switch (month){
            case 1:
                monthName= ("January");
                break;
            case 2:
                monthName=("February");
                break;
            case 3:
                monthName =("March");
                break;
            case 4:
                monthName= ("April");
                break;
            case 5:
                monthName=("May");
                break;
            case 6:
                monthName =("June");
                break;
            case 7:
                monthName =("July");
                break;
            case 8:
                monthName =("August");
                break;
            case 9:
                monthName =("September");
                break;
            case 10:
                monthName =("October");
                break;
            case 11:
                monthName =("November");
                break;
            case 12:
                monthName =("December");
                break;
        }
        int day=0;
            switch (month){
                case 1:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                     day=31;
                     break;
                case 4:
                case 6:
                case 8:
                case 10:
                case 12:
                     day =30;
                     break;
                case 2:
                    if (year%400 == 0 && year%100 == 0 || year%4 == 0){
                        day =29;
                    }else {
                        day =28;
                    }
            }
            System.out.println(monthName+" "+year+" "+"had"+" "+day+" "+"Days");
    }
}
