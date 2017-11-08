package Lr5.Conditions;
//You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0.
// If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10

public class LoterBilet {

    public static void main(String[] args) {

        System.out.println(greenTicket(1,2,3));
        System.out.println(greenTicket(1,2,2));
        System.out.println(greenTicket(1,1,1));
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && c == b) { //���� a=b ��� �=b (������ ���������� ���� �����)
            return 20;          //�� ����� 20
        }
        if (a == b || c == b || a == c) { //�����, ���� a=b ��� c=b ��� a=c (���� ����������)
            return 10;          //�� ����� 10
        }
        return 0;               //���� �� ���� �� ������������������ �� ������, �� ����� 0
    }
}
