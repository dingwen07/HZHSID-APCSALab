package app;

public class App {
    public static void main(String[] args) throws Exception {
        String[] csaStudents = { "Michael", "James", "Tony", "Cheney", "Mark", "Witt", "Billy", "John", "Teresa",
                "Raven" };
        System.out.println(countC(csaStudents));

        int[] intArr = new int[] { 1, 2, 3, 4, 5, 6 };
        System.out.println(arrayMean(intArr));
        int[] minAndMax = arrayMinAndMax(intArr);
        for (int i : minAndMax) {
            System.out.print(i + " ");
        }
        System.out.println();

    }

    public static int countChar(String[] arr, char c) {
        int counter = 0;
        for (String string : arr) {
            if (string.toLowerCase().charAt(0) == c) {
                counter++;
            } else {
                if (string.toUpperCase().charAt(0) == c) {
                    counter++;
                }
            }
        }
        return counter;
    }

    public static int countC(String[] arr) {
        return countChar(arr, 'c');
    }

    public static double arrayMean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return (double) sum / arr.length;
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

    public static int[] arrayMinAndMax(int[] arr) {
        int[] rs = new int[2];
        rs[0] = arrayMin(arr);
        rs[1] = arrayMax(arr);
        return rs;
    }

}