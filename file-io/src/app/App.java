package app;

import java.io.*;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner fScanner = new Scanner(new File("Test.txt"));
        // Scanner iScanner = new Scanner(System.in);
        PrintWriter w = new PrintWriter(new File("newTest.txt"));
        while (fScanner.hasNext()) {
            //System.out.println(fScanner.nextLine());
            w.println(fScanner.nextLine());
        }
        fScanner.close();
        w.close();
    }
}
