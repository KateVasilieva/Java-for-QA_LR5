public class ArrayExample {
   public static void main(String[] args) {
       int[] quickInit = {1,2,3,4,5}; //������� ��������������

       int[] myArray = new  int[10]; //�������� ������ ��� ������
    //   myArray[0] = 3;
    //   myArray[1] = 6;

       for (int i = 7; i < 10; i++) {
           myArray[i] = i;
           System.out.println(myArray[i]);
       }
    }
}




