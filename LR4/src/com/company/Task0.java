package com.company;

public class Task0 {
    public static void main(String[] args) {
        //написать условие, которое сравнит две переменные int low, int high и выведет в консоль текст Уlow is smaller then highФ
        // если число в переменной low меньше числа в переменной high и аналогично, если все будет наоборот.
        int low = 6;
        int high = 5;
        if (low < high) {
            System.out.println("low is smaller then high");
        } else {
            System.out.println("high is smaller then low");
        }

// создать массив test на 10 элементов и с помощью цикла распечатать его.
        int[] test = new int[10];
        for (int i = 0; i < 10; i++) {
            test[i] = i + 10;
            System.out.println(test[i]);
        }

    }
}
