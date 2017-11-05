public class Task1  {
    public static void main(String[] args) {
        //If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
        //Finish the solution so that it returns the sum of all the multiples of 3 or 5 below the number passed in.
        // Note: If the number is a multiple of both 3 and 5, only count it once.
        //(1 % 3) == 0 - проверка будет ли остаток при делении 1 на 3. Ответ - будет и это означает, что число не делиться на 3 без остатка.

        int sum = 0;
        int i;
        for (i = 1; i < 11; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                    sum = sum + i;
            }

            System.out.println(sum);
        }

    }