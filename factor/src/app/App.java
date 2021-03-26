package app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number, counter=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a positive interger:");
        number = sc.nextInt();
        sc.close();

        for(int i=2;i<number;i++){
            if (number%i==0){
                System.out.println(i + " is a factor of " + number + ".");
                counter++;
            }
        }
        System.out.println(number + " have " + counter + " factors.");
    }
}