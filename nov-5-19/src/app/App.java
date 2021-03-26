package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");

        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));
        System.out.println();

        System.out.println(makes10(9, 10));
        System.out.println(makes10(9, 9));
        System.out.println(makes10(1, 9));
        System.out.println();

        System.out.println(notString("TonyHasHorse"));
        System.out.println();

        System.out.println(monkeyTrouble(true, true));
        System.out.println(monkeyTrouble(false, false));
        System.out.println(monkeyTrouble(true, false));
        System.out.println();

        System.out.println(parrotTrouble(true, 6));
        System.out.println(parrotTrouble(true, 7));
        System.out.println(parrotTrouble(false, 6));
        System.out.println();

        System.out.println(lastDigit(7, 17));
        System.out.println(lastDigit(6, 17));
        System.out.println(lastDigit(3, 113));
        System.out.println();

        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
        System.out.println();

        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
        System.out.println();

        System.out.println(close10(8, 13));
        System.out.println(close10(13, 8));
        System.out.println(close10(13, 7));
        System.out.println();

        System.out.println(calculator(2, '+', 2));
        System.out.println(calculator(2, '*', 2));
        System.out.println(calculator(4, '/', 2));
        System.out.println();

        System.out.println(sumDigits(7, 8));
        System.out.println(sumDigits(17, 20));
        System.out.println(sumDigits(10, 12));
        System.out.println();

        System.out.println(checkPerfect(6));
        System.out.println(checkPerfect(28));
        System.out.println(checkPerfect(496));
        System.out.println(checkPerfect(12));
        System.out.println(checkPerfect(97));
        // System.out.println(checkPerfect(33550336));
    }

    public static String stringTimes(String str, int n) {
        String resl = new String();
        for (int i = 0; i < n; i++) {
            resl += str;
        }
        return resl;
    }

    public static boolean makes10(int a, int b) {
        return a == 10 || b == 10 || a + b == 10;
    }

    public static String notString(String str) {
        return "not " + str;
    }

    public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    public static boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    public static boolean lastDigit(int a, int b) {
        return a % 10 == b % 10;
    }

    public static int max1020(int a, int b) {
        int temp = 0;
        if (a >= 10 && a <= 20) {
            temp = a;
        }
        if (b >= 10 && b <= 20 & b > a) {
            temp = b;
        }
        return temp;
    }

    public static int intMax(int a, int b, int c) {
        int large = a;
        if (b > large) {
            large = b;
        }
        if (c > large) {
            large = c;
        }
        return large;
    }

    public static int close10(int a, int b) {
        if (Math.abs(a - 10) < Math.abs(b - 10)) {
            return a;
        } else if (Math.abs(a - 10) == Math.abs(b - 10)) {
            return 0;
        } else {
            return b;
        }
    }

    public static int calculator(int a, char op, int b) {
        if (op == '+') {
            return a + b;
        } else if (op == '-') {
            return a = b;
        } else if (op == '*') {
            return a * b;
        } else if (op == '/') {
            return a / b;
        } else {
            return Integer.MIN_VALUE;
        }
    }

    public static int sumDigits(int a, int b) {
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum += sumDigitsHelper(i);
        }
        return sum;
    }

    private static int sumDigitsHelper(int a) {
        if (a / 10 == 0) {
            return a;
        } else {
            return a % 10 + sumDigitsHelper(a / 10);
        }
    }

    public static boolean checkPerfect(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum == number;
    }

    /*
     * public static boolean isPrime(int number) { if (number > 1){ if (number ==
     * 2){ return true; } else if(number % 2 == 0){ return false; } else { for(int
     * current=3; current<(int)Math.sqrt(number); current+=2){ if(number % current
     * == 0){ return false; } } return false; } } else { return false; } }
     */
}
