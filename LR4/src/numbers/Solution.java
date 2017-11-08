package numbers;

public class Solution {

    public static void main(String[] args) {

        //int result = solution(10);
        System.out.println(solution(10));
    }

    public static int solution(int number) {
        //TODO: Code stuff here
        int sum = 0;
        for (int currentNumber = number - 1; currentNumber > 0; currentNumber--) {
            if ((currentNumber % 3) == 0 || (currentNumber % 5) == 0) {
                sum = sum + currentNumber;
            }
        }
        return sum;
    }
}