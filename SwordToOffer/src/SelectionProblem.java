import java.util.Arrays;

/**
 * һ�����飬��K�������
 */
public class SelectionProblem {
    //ð�ݣ�ȡ����K��λ�õ�Ԫ��
    public static int[] bubbleSort(int[] arr) {
      for (int i=arr.length-1;i>0;--i) {
          for (int j = 0; j < i; ++j) {
              if (arr[j + 1] > arr[j]) {
                  int temp = arr[j + 1];
                  arr[j + 1] = arr[j];
                  arr[j]=temp;
              }
          }
      }
        return arr;
    }



    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9};
        int[] result = bubbleSort(arr);
        System.out.println();
    }
}
