/**
* Author: Shreyas Bhagat
* Date: 26 Mar 2026
* Description: 
*/
package p07_Loops;

import java.util.Scanner;

public class P07_FindLargestNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();

		
		// Logic 1: Using if-else statements
		int max=a;
		if(b > max) {
			max = b;
			
		}
		if (c > max) {
			max = c;
		}
		System.out.println("Largest number is: " + max);
		
		// Logic 2: Using nested ternary operator
		int largest = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
		System.out.println("Largest number using ternary operator is: " + largest);
		
		sc.close();
	}

}
