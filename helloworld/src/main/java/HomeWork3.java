/**
 * Created by Kate Va on 06.12.2016.
 */
public class HomeWork3 {
    public static void main(String args[]) {
        //1
        System.out.println("¹1");
        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
                        System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();

        //2
        System.out.println("¹2");
        int[] mas2 = new int[15];
        int j;
        j = 0;
        for (int i = 0; i < mas2.length; i++) {
            mas2[i] = (int) (Math.random() * 10);
        }
        for (int i = 0; i < mas2.length; i++) {
            if (mas2[i] % 2 == 0) {
                j++;
            }
            System.out.print(mas2[i] + " ");
        }
        System.out.println();
        System.out.println(j);

        //4
        System.out.println("¹4");
        int[][] mas3 = new int[6][7];
        int max;
        for (int i3 = 0; i3< mas.length; i3++) {
            for (int j3 = 0; j3 < mas3[i3].length; j3++) {
                mas3[i3][j3] = (int) (Math.random() * 10);
                System.out.print(mas3[i3][j3]);
            }
            System.out.println();
        }

    }

}
