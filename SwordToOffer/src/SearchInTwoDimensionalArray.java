

public class SearchInTwoDimensionalArray {
    public static boolean Find(int target, int[][] array) {
        for (int i=0;i<array.length;i++) {
            if(array[i].length==0) return false;
            if (array[i][0] <= target && array[i][array[i].length - 1] >= target) {
                for(int j=0;j<array[i].length;j++) {
                    if (array[i][j] == target) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int target=7;
        int[][] array = {{1, 2, 8, 9}, {2, 4, 9, 12}, {4, 7, 10, 13}, {6, 8, 11, 15}};
        System.out.println(Find(target,array));
    }
}
