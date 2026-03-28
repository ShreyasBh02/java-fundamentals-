/**
 * Author: Shreyas Bhagat
 * Date: 14 Mar 2026
 * Description: 
 * Topic A: Conditional Statements (Decision Making)
- Basic: Maximum of Three Numbers
Problem:
	Write a Java program that takes three integer inputs from the user. The program should compare these numbers using if-else statements to determine and print the largest number among them.
	Input: 10, 50, 30
	Output: Largest is: 50
 */
package p06_CondtionalSt;

import java.util.Scanner;

public class Q01_MaximumOfThreeNumbers {

	public static void main(String[] args){
		System.out.println("Enter the 3 numbers:");
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		if (a >= b && a >= c) {
			System.out.println("Largest is: " + a);
		} else if (b >= a && b >= c) {
			System.out.println("Largest is: " + b);
		} else {
			System.out.println("Largest is: " + c);
		}

		sc.close();

	}

}
