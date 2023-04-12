package Test;
import java.io.*;
import java.util.*;


public class GuessNumberGame {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Random ran = new Random();
		int randomNumber = ran.nextInt(100)+1;
		System.out.println("Tell me your guess! from 1 to 100");
		Scanner scanner = new Scanner(System.in);
		int tryCount = 0;
		while(true) {
			tryCount++;
			int playerGuess = scanner.nextInt();
		if(playerGuess == randomNumber) {
			System.out.println("Correct");
			break;
		} else if(randomNumber>playerGuess) {
			System.out.println("I am higher");
		} else if(randomNumber<playerGuess) {
			System.out.println("I am lower");
			
		scanner.close();
		
		
		
	}

}}}
