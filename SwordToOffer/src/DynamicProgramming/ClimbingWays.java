package DynamicProgramming;

/**
 * ��̨�׵�����,һ��ֻ����һ����������
 */
public class ClimbingWays {
    public int violentSearch(int n) {
       if (n<=0) return 0;
       if(n==1) return 1;
       if(n==2) return 2;
        return violentSearch(n - 1) + violentSearch(n - 2);
    }



}
