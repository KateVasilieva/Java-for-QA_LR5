package Lr5.Conditions;

public class SummaAB {
    //Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
    // are forbidden, so in that case just return 20

    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));
        System.out.println(sortaSum(10, 9));
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b; //����� ����� � ������� �������� � ����� � + b
        if (sum < 10 || sum > 19) { //���� ����� ������ 10 ��� ������ 19
            return sum; //�� ����� ���������� �����
        }
        return 20; //����� ����� 20
    }
}
