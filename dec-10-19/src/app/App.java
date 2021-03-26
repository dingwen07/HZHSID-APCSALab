package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        /*
         * int[] javaSoStupid = arrayCyka(new int[] { 1, 64343, 44, 655, 55 }); for (int
         * i : javaSoStupid) { System.out.println(i); }
         */

        boolean[] cyka = new boolean[] { true, false, true, true, true, false, false, true, true, true, true, true,
                true, true, true, true, true, true, true, true, false, true, true };
        System.out.println(is10HeadsRow(cyka));
    }

    public static int arrayMax(int[] arr) {
        int max = arr[0];
        for (int i : arr) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public static int arrayMin(int[] arr) {
        int min = arr[0];
        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public static int[] arrayCyka(int[] arr) {
        int[] newArr = new int[2];
        newArr[0] = arrayMin(arr);
        newArr[1] = arrayMax(arr);
        return newArr;
    }

    public static boolean is10HeadsRow(boolean[] arr) {
        int counter = 0;
        int counterMax = 0;
        for (boolean b : arr) {
            if (b) {
                counter++;
            } else {
                if (counter > counterMax) {
                    counterMax = counter;
                }
                counter = 0;
            }
        }
        System.out.println(counterMax);
        return counterMax >= 10;
    }
}
