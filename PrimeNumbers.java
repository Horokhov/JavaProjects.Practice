import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Please input the limit: ");
        Scanner scanner = new Scanner(System.in);
        int limit = scanner.nextInt();

        List<Integer> primeNumbers = new ArrayList<>();

        int numberToCheck = 2;
        int count = 0;

        while (true) {
            boolean isPrime = true;
            for (int factor = 2; factor <= numberToCheck/2; factor++) {
                if (numberToCheck % factor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(numberToCheck);
                primeNumbers.add(numberToCheck);
                count++;
                if (count >= limit) {
                    break;
                }
            }
            numberToCheck++;
        }

}}
