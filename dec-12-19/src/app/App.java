package app;

import java.util.ArrayList;
import app.NumPair;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 3728, 2323 };
        arr = splitArr(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();

        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<NumPair> arrl = sumPair(arr2, 10);
        for (NumPair np : arrl) {
            System.out.println(np);
        }
    }

    public static int[] splitArr(int[] arr) {
        int[] newArr = new int[arr.length];
        int evenIndex = 0;
        int oddIndex = arr.length - 1;
        for (int value : arr) {
            if (value % 2 == 0) {
                newArr[evenIndex] = value;
                evenIndex++;
            } else {
                newArr[oddIndex] = value;
                oddIndex--;
            }
        }
        return newArr;
    }

    public static ArrayList<NumPair> sumPair(int[] arr, int num) {
        ArrayList<NumPair> res = new ArrayList<NumPair>();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == num) {
                    res.add(new NumPair(arr[i], arr[j]));
                }
            }
        }
        return res;
    }
}