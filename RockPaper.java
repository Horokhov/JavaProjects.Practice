package Test;

import java.util.*;

public class RockPaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		while(true) {
		String[] rps = { "rock", "papirus", "scissors" };
		String computerMove = rps[new Random().nextInt(rps.length)];
		String playerMove;

		while (true) {
			System.out.println("Enter your move");
			playerMove = scanner.nextLine();
			if (playerMove.equals("rock") || playerMove.equals("papirus") || playerMove.equals("scissors")) {
				break;
			}
			System.out.println("It is not a valid move" + playerMove);
		}
		System.out.println("I played" + computerMove);
		if (playerMove.equals(computerMove)) {
			System.out.println("The game was a tie!");
		} else if (playerMove.equals("rock")) {
			if (computerMove.equals("papirus")) {
				System.out.println("You lose");
			} else if (computerMove.equals("scissors")) {
				System.out.println("You win");
			} else if (playerMove.equals("papirus")) {
				if (computerMove.equals("scissors")) {
					System.out.println("You lose");
				} else if (computerMove.equals("rock")) {
					System.out.println("You win");
				} else if (playerMove.equals("scissors")) {
					if (computerMove.equals("papirus")) {
						System.out.println("You win");
					} else if (computerMove.equals("rock")) {
						System.out.println("You lose");
					}
				}
			}
		}
	}
}}
