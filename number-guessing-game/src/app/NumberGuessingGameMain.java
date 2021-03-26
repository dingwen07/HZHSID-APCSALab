package app;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGameMain {
    public static void main(String[] args) throws Exception {
        // Declear varaiables
        int leftInterval, rightInterval, targetNumber, guessNumber, binaryCount, guessCounter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input left interval: ");
        leftInterval = sc.nextInt();
        System.out.print("Input right interval: ");
        rightInterval = sc.nextInt();
        if (leftInterval >= 0 & rightInterval >= 0 & leftInterval != rightInterval) {
            // Swap if right less than left
            if (rightInterval < leftInterval) {
                int t = leftInterval;
                leftInterval = rightInterval;
                rightInterval = t;
            }
            Random rnd = new Random();
            targetNumber = leftInterval + rnd.nextInt(rightInterval - leftInterval + 1);
            binaryCount = (int) (Math.log(rightInterval - leftInterval + 1) / Math.log(2)) + 1;
            do {
                guessCounter++;
                System.out.print("Please input a number between " + leftInterval + " and " + rightInterval + ": ");
                guessNumber = sc.nextInt();
                if (guessNumber > targetNumber) {
                    System.out.println("Too big, make it smaller!");
                    if (guessNumber < rightInterval) {
                        rightInterval = guessNumber;
                    }
                }
                if (guessNumber < targetNumber) {
                    System.out.println("Too small, make it bigger!");
                    if (guessNumber > leftInterval) {
                        leftInterval = guessNumber;
                    }
                }

            } while (guessNumber != targetNumber);
            System.out.println("Congradulations! You got the number!");
            System.out.println("You guessed " + guessCounter + " times.");
            if (guessCounter > binaryCount) {
                System.out.println(
                        "If you use Binary Search, the maximum number of guesses you need is " + binaryCount + "!");
            }

        } else {
            System.err.println("Invalid Input!");
        }
        sc.close();
    }
}