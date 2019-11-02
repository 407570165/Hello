package sample;
//homework1
import java.awt.*;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Hw {
    public static int getisp(String text){
        int isp=0;
        switch (text){
            case "(":
                isp=0;
                break;
            case "%":
            case "*":
            case "/":
                isp=2;
                break;
            case "+":
            case "-":
                isp=1;
                break;
        }
        return isp;
    }

    public static void main(String[] args) {
        String string[]=new String[1000];
        int k =0;
        int real =0 ;
        String s;
        String[] cal =new String[1000];
        Scanner scanner =new Scanner(System.in);
        s=scanner.next();
        StringTokenizer st=new StringTokenizer(s,"+,-,*,/,(,),%",true);
        int i = 0;
        while (st.hasMoreTokens()){
            cal[i] = st.nextToken();
            i++;
        }
        String[] postfix  =new String[1000];
        Stack<String> stacks =new Stack<String>();
        int icp =0;
        for (int j=0;j<cal.length;j++){
            if (cal[j]==null){
                break;
            }
            switch (cal[j]){
                case ")":
                    while (!stacks.peek().equals("(")){
                        string[k]=(stacks.pop());
                        k++;
                    }
                    stacks.pop();
                    break;
                case "(":
                    stacks.push(cal[j]);
                    break;
                case "*":
                case "%":
                case "/":
                case "+":
                case "-":
                    icp=getisp(cal[j]);
                    while (!stacks.empty()&&getisp(stacks.peek())>=icp){
                        string[k]=stacks.pop();
                        k++;
                    }
                    stacks.push(cal[j]);
                    break;
                default:
                    string[k]=(cal[j]);
            }
        }
        while (!stacks.empty()){
            string[k]=(stacks.pop());
        }
        for (int l =0;l<string.length;l++){
            System.out.println(string[l]);
        }
    }
}
