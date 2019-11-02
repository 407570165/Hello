package sample;
//4-11
import java.util.Scanner;
//怎麼才能可以輸入1100 0011 0111
public class Binary {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int k=0;
        String s;
        while (k<=3) {
            s = scanner.nextLine();
            int i = Integer.parseInt(s, 2);
            if (i > 0 && i <= 15) {
                System.out.println(i);
                k++;
            } else if (i > 15 && i <= 31) {
                System.out.println("-" + (32 - i));
                k++;
            }
        }
    }
}
