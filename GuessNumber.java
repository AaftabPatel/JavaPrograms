// Java Program to guess a Random Number Generation
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
	public static void main(String[] args){
		// stores actual and guess number
		int answer, guess, chance = 5;
		// maximum value is 100
		final int MAX = 100;
		// takes input using scanner
		Scanner in = new Scanner(System.in);
		// Random instance
		Random rand = new Random();
		boolean correct = false;
		// correct answer
		answer = rand.nextInt(MAX) + 1;
		// loop until the guess is correct
        System.out.println("PROGRAM FOR RANDOM NUMBER GUESS GAME-");
		while (!correct) {
			chance--;
            System.out.print("Guess a number between 1 and 100: ");
			// guess value
			guess = in.nextInt();
			// if guess is greater than actual
			if (guess > answer && chance>0) {
				System.out.println("Too high, try again -chances left: "+chance);
			}
			// if guess is less than actual
			else if (guess < answer && chance>0) {
				System.out.println("Too low, try again -chances left: "+chance);
			}
            
            // if guess is correct
			else if (guess < answer && chance>0) {
				System.out.println("Yes, you guessed the number.");
				correct = true;
			}
			// guess is equal to actual value
			else {
				System.out.println("GAME OVER!!");
                System.out.println("Correct answer is: "+ answer);
				correct = true;
			}
		}
		System.exit(0);
	}
}
