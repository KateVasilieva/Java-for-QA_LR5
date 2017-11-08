package Lr5.Conditions;
//You have a green lottery ticket, with ints a, b, and c on it. If the numbers are all different from each other, the result is 0.
// If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10

public class LoterBilet {

    public static void main(String[] args) {

        System.out.println(greenTicket(1,2,3));
        System.out.println(greenTicket(1,2,2));
        System.out.println(greenTicket(1,1,1));
    }

    public static int greenTicket(int a, int b, int c) {
        if (a == b && c == b) { //если a=b или с=b (полное совпадение всех чисел)
            return 20;          //то верни 20
        }
        if (a == b || c == b || a == c) { //иначе, если a=b или c=b или a=c (одно совпадение)
            return 10;          //то верни 10
        }
        return 0;               //если ни одно из вышеперечисленного не правда, то верни 0
    }
}
