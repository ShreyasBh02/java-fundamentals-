/**
* Author: Shreyas Bhagat
* Date: 15 Mar 2026
* Description: Prime Number Checker
	Problem:
	Write a program to determine if a given number N is a Prime Number.
	Definition: A prime number is a number greater than 1 that has exactly two factors: 1 and itself.
	Optimization Hint: If you find any number that divides N evenly between 2 and N/2, the number is not prime, and you should stop the loop immediately using break.
*/
package p07_Loops;
public class Q03_PrimeNoChecker {

	public static void main(String[] args) {
		int N = 29; 
		boolean isPrime = true;

		if (N <= 1) {
			isPrime = false;
		} else {
			for (int i = 2; i <= N / 2; i++) {
				if (N % i == 0) {
					isPrime = false; 
					break;
				}
			}
		}

		if (isPrime) {
			System.out.println(N + " is a Prime Number.");
		} else {
			System.out.println(N + " is not a Prime Number.");
		}


	}

}
