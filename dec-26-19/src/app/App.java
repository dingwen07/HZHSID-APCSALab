package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        int[][] arr = { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9 }, { 2, 3, 4, 5, 6 }, { 7, 8, 9, 1, 2 } };
        int[][] newArr = rotate(arr, true);
        for (int[] is : newArr) {
            for (int i : is) {
                System.out.print(i + "\t");
            }
            System.out.println();
        }
    }

    public static int[][] clockwise(int[][] arr) {
        int maxLen = 0;
        for (int[] is : arr) {
            if (is.length > maxLen) {
                maxLen = is.length;
            }
        }
        int[][] newArr = new int[maxLen][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                newArr[j][arr.length - i - 1] = arr[i][j];
            }
        }
        return newArr;
    }

    public static int[][] anticlockwise(int[][] arr) {
        int maxLen = 0;
        for (int[] is : arr) {
            if (is.length > maxLen) {
                maxLen = is.length;
            }
        }
        int[][] newArr = new int[maxLen][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                newArr[arr[0].length - j - 1][i] = arr[i][j];
            }
        }
        return newArr;
    }

    public static int[][] rotate(int[][] arr, boolean b) {
        int maxLen = 0;
        for (int[] is : arr) {
            if (is.length > maxLen) {
                maxLen = is.length;
            }
        }
        int[][] newArr = new int[maxLen][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (b) {
                    newArr[j][arr.length - i - 1] = arr[i][j];
                } else {
                    newArr[arr[0].length - j - 1][i] = arr[i][j];
                }
            }
        }
        return newArr;

    }

    /**
     *     0 1 2 3 4
     * 
     * 0   1 2 3 4 5
     * 1   6 7 8 9
     * 2   2 3 4 5 6
     * 3   7 8 9 1 2
     */

}