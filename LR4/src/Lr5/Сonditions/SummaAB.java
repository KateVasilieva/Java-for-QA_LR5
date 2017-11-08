package Lr5.Ñonditions;

public class SummaAB {

    public static void main(String[] args) {
        System.out.println(sortaSum(3, 4));
        System.out.println(sortaSum(9, 4));
        System.out.println(sortaSum(10, 11));
        System.out.println(sortaSum(10, 9));
    }

    public static int sortaSum(int a, int b) {
        int sum = a + b;
        if (sum < 10 || sum > 19) {
            return sum;
        }
        return 20;
    }
}
