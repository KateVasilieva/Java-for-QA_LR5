package Lr5.Cycle;
//Given an array of ints length 3, return the sum of all the elements.
public class ArraySum {

    public static void main(String[] args) {
        int[] myArray = {1,2,3};
        System.out.println(sum3(myArray));
        int[] myArray1 = {3,4,5};            //�� �������, ������ ��� ������ ��� ��� ������ ������ � ������� �������
        System.out.println(sum3(myArray1));

    }
    public static int sum3(int[] nums) {
        int sum=0;                   //������� ����� ���������� sum ��� �������� ��������� �������
        for (int i=0; i<3; i++) {    //��� i(����� �������� �������) �� ���� �� 3 (��������������, �.�. �� 2)
            sum = sum + nums[i];     //� ����� (���������� 0) ���������� �������� ������� ��� ������� i
        }
        return sum;     //����� ��������� ������� �����
    }

}
