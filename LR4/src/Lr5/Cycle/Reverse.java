package Lr5.Cycle;

//Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

import java.util.Collections;

public class Reverse {
    public static void main(String[] args) {
        int[] myArray = {5, 8, 3};
        System.out.println(reverse3(myArray));
    }

    public static int[] reverse3(int[] nums) {
        int[] nums_rev = new int[nums.length];   //создаем новый массив, в который положим реверс значений исходного массива nums
        for (int i = 0; i < nums.length; i++){  //дл€ i(номер элемента массива) от нул€ до длины массива
            int n = nums.length - i ;           //нова€ переменна€ n(счетчик дл€ nums_rev)=длина исходного массива-текущий номер элемента nums
            nums_rev[n] = nums[i];    //ƒјЋ№Ў≈ я «јѕ”“јЋј—№ „“ќ ƒ≈Ћј“№
        }
        return nums_rev;
    }
}
