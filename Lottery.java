import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Lottery {
    public static void main(String[] args) {

        List<Integer> winningNumbers = new ArrayList<>();

        Random random = new Random();

        for(int i=0; i<6; i++) {
            while(true) {
                int winningNumber = random.nextInt(39 + 1);
                if (!winningNumbers.contains(winningNumber)) {
                    winningNumbers.add(winningNumber);
                    break;
                }
            }
        }
        System.out.println("Please enter your 6 numbers between 1 and 39: ");

        Scanner scanner = new Scanner(System.in);

        List<Integer> guessedNumbers = new ArrayList<>();
        for(int i=0; i<6; i++) {
            while (true) {
                try{
                String numberString = scanner.nextLine();
                int number = Integer.parseInt(numberString);
                if(number >= 1 && number <= 39) {
                    guessedNumbers.add(number);
                    break;
                } else {
                    System.out.println(number+" is invalid");
                }
            } catch (NumberFormatException nfp) {
                    System.out.println("Stop breaking me!!!");
                }
            }
    }
        System.out.println("The winning numbers were: " + winningNumbers);
        System.out.println("Your numbers are: " + guessedNumbers);

        guessedNumbers.retainAll(winningNumbers);

        System.out.println("Your matched numbers are: " + guessedNumbers);

        if(guessedNumbers.containsAll(winningNumbers)) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost!");
        }
        
        scanner.close();
}}
