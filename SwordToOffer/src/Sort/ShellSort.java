package Sort;

public class ShellSort {
    //�����Ե���shellֵ����ģ�Ч�ʲ��Ǻܺ�
    public static void shellSort(int[] a) {
        int j;
        for (int gap=a.length/2;gap>0;gap/=2) {
            for (int i=gap;i<a.length;i++) {
                int tmp=a[i];
                for (j=i;j>=gap&&tmp<a[j-gap];j-=gap) {
                    a[j] = a[j - gap];
                }
                a[j]=tmp;
            }
        }
    }
}
