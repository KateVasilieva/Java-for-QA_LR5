/**
 * Created by Kate Va on 02.11.2016.
 */
public class HelloWorld {

    public static void main(String args[]) {
        int i = 4;
        if (i % 2 > 0) {
            System.out.println("�������� �����");
        } else System.out.println("������ �����");


        double m = 8.5;
        double n = 16.5;
        if (Math.abs(10 - m) > Math.abs(10 - n)) {
            System.out.println("����� ����� " + m +" � "+ n+ " ��������� � ������ "+ n);
        }    else System.out.println("����� ����� " + m +" � "+ n+ " ��������� � ������ "+ m);


        int h=120;
        if (h>25 & h<100) {
            System.out.println("����� " + h +" ���������� � ��������� (25;100)");
        }    else System.out.println("����� " + h +" �� ���������� � ��������� (25;100)");


        double a,b,c,D,x1,x2;
        a=10;
        b=50;
        c=22;
        D=b*b-4*a*c;
        if (D>0)  {
        x1=Math.round((-b+Math.sqrt(D))/2*a);
        x2=Math.round((-b-Math.sqrt(D))/2*a);
        System.out.println("����� ��������� "+x1+" � "+x2);}
        else {System.out.println("������ ���");}




            }

    }
