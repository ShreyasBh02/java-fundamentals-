/**
 * Author: Shreyas Bhagat
 * Date: 14 Mar 2026
 * Description: Demonstrates basic if-else conditional statements
 *              including simple comparison and even/odd number check.
 */

package p06_CondtionalSt;
public class p02_IfElse {

	public static void main(String[] args) {  
		// Example 1: Simple if-else comparison
        int x = 30;
        if (x < 20) {
            System.out.println("This is the if statement");
        } else {
            System.out.println("This is the else statement");
        }

        // Example 2: Check if a number is even or odd
        int number = 12;
        if (number % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

	}
}
