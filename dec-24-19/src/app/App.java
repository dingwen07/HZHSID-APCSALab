package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        int[][] arr = { { 4, 6, 2, 5 }, { 7, 9, 4, 8 }, { 6, 9, 3, 7 } };
        int[][] arr2 = { { 3, 5, 7, 9 }, { 4, 2 }, { 5, 7, 8, 6 }, { 6 } };
        System.out.println(question1(arr));
        System.out.println(avgRating2(arr2, 1));
        int[] test = allRowSums(arr2);
        for (int i : test) {
            System.out.println(i);
        }
    }

    public static double avgRating(int[][] arr, int idx) {
        int sum = 0;
        for (int[] is : arr) {
            sum += is[idx];
        }
        return (double) sum / arr.length;
    }

    public static double question1(int[][] arr) {
        return avgRating(arr, 3);
    }

    public static double avgRating2(int[][] arr, int idx) {
        int sum = 0;
        int counter = 0;
        for (int[] is : arr) {
            try {
                sum += is[idx];
                counter++;
            } catch (Exception e) {
            }
        }
        return (double) sum / counter;
    }

    public static int[] allRowSums(int[][] arr) {
        int[] sums = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sums[i] += arr[i][j];
            }
        }
        return sums;
    }

    public static boolean isRowMagic(int[][] arr) {
        boolean b = true;
        int[] sums = allRowSums(arr);
        for (int i : sums) {
            if (i != sums[0]) {
                b = false;
            }
        }
        return b;
    }

    public static boolean isColumnMagic(int[][] arr) {
        boolean b = true;
        int preSum = 0;
        int maxColLength = 0;
        for (int[] is : arr) {
            if (is.length > maxColLength) {
                maxColLength = is.length;
            }
        }
        for (int i = 0; i < maxColLength; i++) {
            int sum = 0;
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += arr[j][i];
                } catch (Exception e) {
                }
            }
            if (sum != preSum) {
                b = false;
            }
            preSum = sum;
        }
        return b;
    }

    public static boolean isSquare(int[][] arr) {
        boolean b = true;
        for (int[] is : arr) {
            if (is.length != arr[0].length) {
                b = false;
            }
        }
        return b;
    }
}