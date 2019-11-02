package sample;
//1-13
import java.sql.SQLOutput;
import java.util.Scanner;

class Cramer {
    double a, b, c, d, e, f;

    Cramer(double a1, double b1, double c1, double d1, double e1, double f1) {
        a = a1;
        b = b1;
        c = c1;
        d = d1;
        e = e1;
        f = f1;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getD() {
        return d;
    }

    public double getE() {
        return e;
    }

    public double getF() {
        return f;
    }

    private boolean isEquationSame() {
        boolean t = false;
        if (a == c && b == d && e == f)
            t = true;
        if (a / c == b / d && a / c == e / f)
            t = true;
        return t;
    }
    public boolean issoVable(){
        boolean t=true;
        t = true;
        if (a*d-b*c==0)
            t=false;
        if (isEquationSame()==true)
            t=true;
        return t;
    }
    public String getX(){
        if (issoVable()==true){
            return String.valueOf((e*d-b*f)/(a*d-b*c));
        }
        else
            return "無解";
    }
    public String getY(){
        if (issoVable()==true){
            return  String.valueOf((a*f-e*c)/(a*d-b*c));
        }
        else
            return "無解";
    }

}
public class Main{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double e=scanner.nextDouble();
        double c =scanner.nextDouble();
        double d=scanner.nextDouble();
        double f=scanner.nextDouble();
        Cramer cramer =new Cramer(a,b,c,d,e,f);
        System.out.println(cramer.getX()+" "+cramer.getY());
    }
}

