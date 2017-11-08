package Lr5.Cycle;
//Given an array of ints, return the sum of the first 2 elements in the array.
// If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0

public class ArraySum2 {
    public static void main(String[] args) {
        int[] myArray = {5, 8, 3};
        System.out.println(sum2(myArray));
    }

    public static int sum2(int[] nums) {
        int sum = 0;                            //создаем новую переменную sum для сложения элементов массива
        for (int i = 0; i < nums.length; i++) {   //для i(номер элемента массива) от нуля до длины массива
            sum = sum + nums[i];              // к сумме (изначально 0) прибавляем значение массива под номером i
            if (i == 1) {                     //если номер элемента 1 (т.е. к этому моменту в sum уже сложаться (i=0 и i=1)...
                break;                       //...выходим из цикла
            }
        }
        return sum;                       //после окончания цикла вернуть сумму
    }
}
