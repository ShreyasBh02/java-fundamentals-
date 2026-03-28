/**
* Author: Shreyas Bhagat
* Date: 15 Dec 2025
* Description: 
*/
package Practise;
public class p04_condtionalStmnt_IfElse {
	
	// Q1: Voting Eligibility
	// Input age. If age ≥ 18, print "Eligible to vote", else print "Not eligible".
	public void checkVotingEligibility(int age) {
		if(age> 18) {
			System.out.println("Eligible to vote");
			
		}
		else {
			System.out.println("Not eligible");
		}
	}

	// Q2: Temperature Check
	// Input temperature. If temperature > 30, print "Hot Day", else print "Cool Day".
	public void checkTemperature(int temperature) {
		if(temperature> 30) {
			System.out.println("Hot Day");
			
		}
		else {
			System.out.println("Cool Day");
		}
	}

	
	// Q3: Number Comparison
	// Input two numbers. Print the larger number using if-else.
	public void compareNumber(int a, int b) {
		if (a > b)
			System.out.println(a + " is larger");
		else
			System.out.println(b + " is larger");
		
	}

	// Q4: Pass or Fail
	// A student passes an exam if their score is 50 or higher. Otherwise, they fail.
	// Condition: score >= 50

	public void checkPassOrFail(int score) {
		if (score >= 50) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}
	}
	
	// Q5: Even or Odd
	// Given an integer, determine if it is an even number or an odd number.
	// Condition: number % 2 == 0
	public void checkEvenOrOdd(int number) {
		if (number % 2 == 0) {
			System.out.println("Even");
		} else {
			System.out.println("Odd");
		}
	}
	
	
	// Q6: Login Authentication
	// A user attempts to log in with a username and password.
	// If both match the stored validUsername and validPassword → print "Login Successful"
	// Otherwise → print "Invalid Credentials"
	// Condition: username == validUsername AND password == validPassword
	public void authenticateLogin(String username, String password) {
		String validUsername = "admin";
		String validPassword = "password123";

		if (username.equals(validUsername) && password.equals(validPassword)) {
			System.out.println("Login Successful");
		} else {
			System.out.println("Invalid Credentials");
		}
	}
	
	public static void main(String[] args) {
		p04_condtionalStmnt_IfElse classobj = new p04_condtionalStmnt_IfElse();
		classobj.checkVotingEligibility(20);
		classobj.checkTemperature(35);
		classobj.compareNumber(10, 20);
		classobj.checkPassOrFail(45);
		classobj.checkEvenOrOdd(7);
		classobj.authenticateLogin("admin", "password123");
	}
	
}
