package app;

public class App {
    public static void main(String[] args) throws Exception {
        int[] arr = {1,1,1,2,2,3,4,5,3,3,9,3};
        int[] res = freq(arr);
        System.out.println(res[0] + " " + res[1]);
    }

    public static void reverse(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int t = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = t;
        }
    }

    public static int[] move(int[] arr, int k) {
        if (k < 0) {
            k = arr.length + k % arr.length;
        }
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[(i + k) % arr.length] = arr[i];
        }
        return newArr;
    }

    public static int[] freq(int [] arr){
        int[] res = new int[2];
        int[] l = new int[findMax(arr)];
        for (int i : arr) {
            l[i]++;
        }
        res[0] = findMax(l);
        res[1] = l[res[0]];
        return res;
    }

    public static int findMax(int[] arr){
        int index = 0;
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}