package DynamicProgramming;

public class ViolentSearch {
    public int coins(int[] arr, int aim) {
        if (arr == null || arr.length == 0 || aim < 0) {
            return 0;
        }
        return process(arr, 0, aim);
    }

    private int process(int[] arr, int index, int aim) {
        int res=0;
        if (index == arr.length) {
//            if (aim == 0) {
//                res = 1;
//            } else {
//                res=0;
//            }
            res=aim==0?1:0;
        } else {
            for (int i = 0; arr[index] * i <= aim; i++) {
                res = res + process(arr, index + 1, aim - arr[index] * i);
            }
        }
        return res;
    }
}
