package Lr5.Cycle;
//Given an array of ints length 3, return the sum of all the elements.
public class ArraySum {

    public static void main(String[] args) {
        int[] myArray = {1,2,3};
        System.out.println(sum3(myArray));
        int[] myArray1 = {3,4,5};            //не понимаю, почему тут нельзя еще раз первый массив с другими данными
        System.out.println(sum3(myArray1));

    }
    public static int sum3(int[] nums) {
        int sum=0;                   //создаем новую переменную sum для сложения элементов массива
        for (int i=0; i<3; i++) {    //для i(номер элемента массива) от нуля до 3 (невключительно, т.е. до 2)
            sum = sum + nums[i];     //к сумме (изначально 0) прибавляем значение массива под номером i
        }
        return sum;     //после окончания вернуть сумму
    }

}
