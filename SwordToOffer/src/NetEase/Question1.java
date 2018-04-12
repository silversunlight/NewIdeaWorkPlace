package NetEase;

import java.util.Scanner;

public class Question1 {
    public static int isCovered(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {
        return 1;
    }

    public static int Count(int[][] zuobiao) {
        return 1;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] zuobiao = new int[4][n];
        while (in.hasNext()) {
            for (int i = 0; i < 4; i++) {
                for (int j = 0; j < n; j++) {
                    zuobiao[i][j] = in.nextInt();
                }
            }
        }
    }
}
