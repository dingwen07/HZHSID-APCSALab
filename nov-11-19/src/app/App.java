package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        question1();
        question2();
        question3();
    }

    public static void question1() {
        int sum = 0;
        for (int i = 3; i < 1000; i += 3) {
            if (i % 5 != 0) {
                sum += i;
            }
        }
        for (int i = 5; i < 1000; i += 5) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void question2() {
        long old_term = 0;
        long term = 1;
        for (int i = 0; i <= 100; i++) {
            System.out.println(term);
            long t = term + old_term;
            old_term = term;
            term = t;
        }
    }

    public static void question3() {
        long number = 1;
        int counter = 1;
        while (counter <= 10001) {
            number += 2;
            boolean isPrime = true;
            outer: for (long i = 3; i < number; i+=2) {
                if (number % i == 0) {
                    isPrime = false;
                    break outer;
                }
            }
            if (isPrime) {
                counter++;
            }
        }
        System.out.println(number);
    }
}
