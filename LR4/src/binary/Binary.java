package binary;//Given an array of one's and zero's convert the equivalent binary value to an integer
//Eg: [0, 0, 0, 1] is treated as 0001 which is the binary representation of 1
//Examples: [0, 0, 0, 1]

import java.util.ArrayList;
import java.util.List;

public class Binary {

    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList();
        myArray.add(1);
        myArray.add(0);
        myArray.add(0);
        myArray.add(1);

        System.out.println(convertBinaryArrayToInt(myArray));
    }

    public static int convertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        String sum = "";
        for (int i = 0; i < binary.size(); i++) {
            int currentNumber = binary.get(i); //�������� ������� �����
            sum = sum + currentNumber; // ��� �� ������� ������ �� �����
            if ((i + 1) % 4 == 0) { //�����������, ��� ����� ������ 4 �����, � �� 3 ��� 2 ��� 1
                return Integer.parseInt(sum, 2); //�������� � Int �� �������� �������
            }
        }
        return 0;
    }
}
