package app;

public class App2 {
    public static void main(String[] args) throws Exception {
        System.out.println("NM$L");
    }

    public static int max(int[][] arr) {
        int max = arr[0][0];
        for (int[] is : arr) {
            for (int i : is) {
                if (i > max) {
                    max = i;
                }
            }
        }
        return max;
    }

    public static int[][] swapArr(int[][] arr, int firstRow, int secondRow) {
        int[][] newArr = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            if (i == firstRow) {
                newArr[i] = arr[secondRow];
            } else if (i == secondRow) {
                newArr[i] = arr[firstRow];
            } else {
                newArr[i] = arr[i];
            }
        }
        return newArr;
    }

    public static int[] peakCyka(int[][] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 1; j < arr[i].length - 1; j++) {
                if (arr[i][j - 1] < arr[i][j] && arr[i][j + 1] < arr[i][j]) {
                    sum++;
                }
            }
            newArr[i] = sum;
        }
        return newArr;
    }
}