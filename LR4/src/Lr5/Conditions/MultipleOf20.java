package Lr5.Conditions;

//Return true if the given non-negative number is 1 or 2 more than a multiple of 20

public class MultipleOf20 {

    public static void main(String[] args) {
        System.out.println(more20(20));
        System.out.println(more20(21));
        System.out.println(more20(22));
    }

    public static boolean more20(int n) {
        if ((n % 20) == 1 || (n % 20) == 2) { //���� ����� ������� �� 20 � �������� 1 ��� �������� 2
            return true; //�� ����� true
        }
        return false; //����� ����� false
    }

}
