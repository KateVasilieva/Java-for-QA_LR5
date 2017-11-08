package Lr5.Ñonditions;

public class LoterBilet {

    public static void main(String[] args) {

        System.out.println(greenTicket(1,2,3));
        System.out.println(greenTicket(1,2,2));
        System.out.println(greenTicket(1,1,1));
    }


    public static int greenTicket(int a, int b, int c) {
        if (a == b && c == b) {
            return 20;
        }
        if (a == b || b == c) {
            return 10;
        }
        return 0;
    }
}
