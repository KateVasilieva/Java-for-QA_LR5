package Lr5.Cycle;

//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        int[] myArray = {5, 8, 3};
        System.out.println(reverse3(myArray));
    }

    public static int[] reverse3(int[] nums) {
        int[] nums_rev = new int[nums.length];   //������� ����� ������, � ������� ������� ������ �������� ��������� ������� nums
        for (int i = 0; i < nums.length; i++){  //��� i(����� �������� �������) �� ���� �� ����� �������
            int n = nums.length - i ;           //����� ���������� n(������� ��� nums_rev)=����� ��������� �������-������� ����� �������� nums
            nums_rev[n] = nums[i];    //������ � ���������� ��� ������
        }
        return nums_rev;
    }
}
