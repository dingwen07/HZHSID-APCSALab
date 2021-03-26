package app;

import java.util.Scanner;

public class IncomeTaxCalculatorMain {
    public static void main(String[] args) throws Exception {
        // Constants
        final double FLAT_TAX_RATE = 0.2;
        final double STANDARD_DEDUCTION = 10000.0;
        final double DEPENDENT_DEDUCTION = 2000.0;

        // Varaibles
        double grossIncome = 0.0;
        double totalDeduction = 0.0;
        double deductedIncome = 0.0;
        double tax = 0.0;
        int dependents = 0;

        // Get value from user
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the gross income: ");
            grossIncome = sc.nextDouble();
            System.out.print("Enter the number of dependents: ");
            dependents = sc.nextInt();
            sc.close();
        } catch (Exception e) {
            System.out.println("Invalid Input");
            System.exit(1);
        }

        totalDeduction = STANDARD_DEDUCTION + dependents * DEPENDENT_DEDUCTION;
        deductedIncome = grossIncome - totalDeduction;
        if (deductedIncome < 0) {
            tax = 0.0;
        } else {
            tax = deductedIncome * FLAT_TAX_RATE;
        }
        System.out.print("The income tax is $");
        System.out.println(tax);

    }
}