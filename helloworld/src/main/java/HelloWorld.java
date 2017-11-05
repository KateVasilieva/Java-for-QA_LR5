/**
 * Created by Kate Va on 02.11.2016.
 */
public class HelloWorld {

    public static void main(String args[]) {
        int i = 4;
        if (i % 2 > 0) {
            System.out.println("Нечетное число");
        } else System.out.println("Четное число");


        double m = 8.5;
        double n = 16.5;
        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.println("среди чисел " + m +" и "+ n+ " ближайшее к десяти "+ n);
        }    else System.out.println("среди чисел " + m +" и "+ n+ " ближайшее к десяти "+ m);


        int h=120;
        if (h>25 & h<100) {
            System.out.println("Число " + h +" содержится в интервале (25;100)");
        }    else System.out.println("Число " + h +" не содержится в интервале (25;100)");


        double a,b,c,D,x1,x2;
        a=10;
        b=50;
        c=22;
        D=b*b-4*a*c;
        if (D>0)  {
        x1=Math.round((-b+Math.sqrt(D))/2*a);
        x2=Math.round((-b-Math.sqrt(D))/2*a);
        System.out.println("Корни уравнения "+x1+" и "+x2);}
        else {System.out.println("Корней нет");}




            }

    }
