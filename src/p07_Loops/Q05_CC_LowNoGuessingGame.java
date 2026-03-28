/**
* Author: Shreyas Bhagat
* Date: 15 Mar 2026
* Description: Low Number Guessing Game
Problem:
	Write a game where the system has a "Secret Number" (e.g., 42).
	The program should ask the user to guess the number.
	- If the guess is higher than the secret, print "Too High!".
	- If the guess is lower than the secret, print "Too Low!".
	- The game should continue asking for guesses (using a do-while loop) until the user guesses correctly.
	Bonus: Count and print how many attempts it took to win.


*/
package p07_Loops;

import java.util.Scanner;

public class Q05_CC_LowNoGuessingGame {

	public static void main(String[] args) {
		int secretNumber = 49;
        int userGuess;
        int attempts = 0;
        
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Welcome to the Secret Number Game! ---");
        System.out.println("I'm thinking of a number. Can you guess it?");

        do {
            System.out.print("Enter your guess: ");
            userGuess = sc.nextInt();
            attempts++;

            if (userGuess > secretNumber) {
                System.out.println("Too High! Try again.");
            } else if (userGuess < secretNumber) {
                System.out.println("Too Low! Try again.");
            } else {
                System.out.println("\nCongratulations! You've guessed it.");
                System.out.println("The secret number was: " + secretNumber);
                System.out.println("It took you " + attempts + " attempts to win!");
            }

        } while (userGuess != secretNumber); 

        sc.close();
	}

}
