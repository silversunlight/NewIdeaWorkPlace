package DynamicProgramming;

public class MemorySearch {
    public int coins(int[] arr, int aim) {
        if (arr == null | arr.length == 0 || aim < 0) {
            return 0;
        }
        int[][] map = new int[arr.length + 1][aim + 1];
        return process(arr, 0, aim, map);
    }

    private int process(int[] arr, int index, int aim, int[][] map) {
        int res = 0;
        if (index == arr.length) {
            if (aim == 0) {
                res = 1;
            } else {
                res = 0;
            }
        } else {
            int mapValue;
            for (int i = 0; arr[index] * i <= aim; i++) {
                mapValue = map[index+1][aim - arr[index] * i];
                if (mapValue != 0) {
                    res += mapValue == -1 ? 0 : mapValue;
                } else {
                    res = res + process(arr, index + 1, aim - arr[index] * i, map);
                }
            }
        }
        map[index][aim] = res == 0 ? -1 : res;
        return res;
    }
}
