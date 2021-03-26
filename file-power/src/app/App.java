package app;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner fScanner = new Scanner(new File("input.txt"));

        PrintWriter w = new PrintWriter(new File("newTest.txt"));
        int base, pow;
        while (fScanner.hasNext()) {
            
            System.out.println(fScanner.nextInt());
            //w.println(fScanner.nextLine());
        }
        fScanner.close();
        w.close();
    }
}
