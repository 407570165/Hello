package sample;

import java.util.Scanner;
public  class Stack {
    public static int geticp(char text) {
        int icp = 0;
        switch (text) {
            case '(':
                icp = 4;
                break;
            case '*':
            case '/':
                icp = 2;
                break;
            case '+':
            case '-':
                icp = 1;
                break;
            default:
                break;
        }
        return icp;
    }
        public static int getisp(char text){
            int isp=0;
            switch (text){
                case '(':
                    isp=0;
                    break;
                case '*':
                case '/':
                    isp=2;
                    break;
                case '+':
                case '-':
                    isp=1;
                    break;
            }

            return isp;
        }
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str =scanner.nextLine();

        char[] infix =new char[str.length()+1];
        char[] stacks =new char[str.length()];
        int top =0;
        for (int i =0;i<str.length();i++){
            infix[i]=str.charAt(i);//把所有陣列裡的東西都存入
        }
        infix[str.length()]='#';
        int icp =0;
        int isp=0;
        for (int j=0;j<infix.length;j++){
            switch (infix[j]){
                case ')':
                    while (stacks[top]!='('){
                        System.out.print(stacks[top]+" ");
                        top--;
                    }
                    stacks[top]='\0';
                    top--;
                    break;
                case '#':
                    for (int s =top;s>=0;s--){
                        if (stacks[s]!='\0'){
                            System.out.print(stacks[s]+" ");
                        }
                    }
                    break;
                case '(':
                case '*':
                case '/':
                case '+':
                case '-':
                    icp =geticp(infix[j]);
                    if (top==-1){
                        top++;
                        stacks[top]=infix[j];
                    }else {
                        isp= getisp(stacks[top]);
                        if (icp>isp){
                         top++;
                         stacks[top]=infix[j];
                        }else {
                            while (icp<=getisp(stacks[top])){
                                System.out.print(stacks[top--]+" ");
                            }
                            top++;
                            stacks[top]=infix[j];
                        }
                    }
                    break;
                default:
                    System.out.print(infix[j]+" ");
            }
        }
    }
}
