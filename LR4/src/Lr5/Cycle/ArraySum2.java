package Lr5.Cycle;
//Given an array of ints, return the sum of the first 2 elements in the array.
// If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0

public class ArraySum2 {
    public static void main(String[] args) {
        int[] myArray = {5, 8, 3};
        System.out.println(sum2(myArray));
    }

    public static int sum2(int[] nums) {
        int sum = 0;                            //������� ����� ���������� sum ��� �������� ��������� �������
        for (int i = 0; i < nums.length; i++) {   //��� i(����� �������� �������) �� ���� �� ����� �������
            sum = sum + nums[i];              // � ����� (���������� 0) ���������� �������� ������� ��� ������� i
            if (i == 1) {                     //���� ����� �������� 1 (�.�. � ����� ������� � sum ��� ��������� (i=0 � i=1)...
                break;                       //...������� �� �����
            }
        }
        return sum;                       //����� ��������� ����� ������� �����
    }
}
