package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int bigInt, smallInt;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input two integers:");
        bigInt = sc.nextInt();
        smallInt = sc.nextInt();
        int temp;
        if (bigInt < smallInt) {
            temp = bigInt;
            bigInt = smallInt;
            smallInt = temp;
        }
        int result = bigInt / smallInt;
        int reminder = bigInt % smallInt;
        System.out.println(result + " r=" + reminder);
        sc.close();
    }
}