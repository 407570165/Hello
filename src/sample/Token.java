package sample;

import java.util.Scanner;

public class Token {

    private static boolean first;
    private static boolean isTrue;

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String a =scanner.next();
        String b =scanner.next();
        char origin[] =new char[a.length()];
        for (int i =0;i<a.length();i++){
              origin[i]=(a.charAt(i));
        }
        char trace []=new char[b.length()];
        for (int i =0;i<b.length();i++){
            trace[i]=b.charAt(i);
        }
        for (int j =1;j<a.length();j++){
            for (int k =1;k<b.length();k++) {
                if (trace[k - 1] == origin[j - 1]) {
                    first = true;
                    if (trace[k] == origin[j]) {
                        isTrue = true;
                    }
                }
            }
        }
        if (first&&isTrue){
            System.out.println(b+" is a substring of "+a);
        }else
            System.out.println(b+" is not a substring of "+a);
    }
}
