package com.company;

public class Task0 {
    public static void main(String[] args) {
        //�������� �������, ������� ������� ��� ���������� int low, int high � ������� � ������� ����� �low is smaller then high�
        // ���� ����� � ���������� low ������ ����� � ���������� high � ����������, ���� ��� ����� ��������.
        int low = 6;
        int high = 5;
        if (low < high) {
            System.out.println("low is smaller then high");
        } else {
            System.out.println("high is smaller then low");
        }

// ������� ������ test �� 10 ��������� � � ������� ����� ����������� ���.
        int[] test = new int[10];
        for (int i = 0; i < 10; i++) {
            test[i] = i + 10;
            System.out.println(test[i]);
        }

    }
}
