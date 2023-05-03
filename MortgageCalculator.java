import java.text.NumberFormat;
import java.util.Scanner;

public class MortgageCalculator {

    private static final int monthsInAYear = 12;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the principal amount:");
        double principal = scanner.nextDouble();

        System.out.println("Enter the interest rate:");
        float annualInterestRate = scanner.nextFloat();

        System.out.println("Enter the term in years:");
        int term = scanner.nextInt();

        float monthlyInterestRate = annualInterestRate/monthsInAYear;

        int numberOfPayments = term * monthsInAYear;

        int monthlyPayment = (int) (principal * (
                (monthlyInterestRate * (Math.pow(1+monthlyInterestRate,numberOfPayments))) /
                        ((Math.pow(1+monthlyInterestRate,numberOfPayments))-1)
                        ));

        scanner.close();

        System.out.println("Monthly payment is: " + NumberFormat.getCurrencyInstance().format(monthlyPayment));

        System.out.println("Total payback is: " + NumberFormat.getCurrencyInstance().format(monthlyPayment * numberOfPayments));
    }
}
