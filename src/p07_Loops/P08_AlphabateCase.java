/**
 * Author: Shreyas Bhagat
 * Date: 26 Mar 2026
 * Description: Check whether an alphabet is uppercase or lowercase.
 */
package p07_Loops;

import java.util.Scanner;

public class P08_AlphabateCase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a character: ");
		char ch = sc.next().trim().charAt(0);

		if (ch >= 'A' && ch <= 'Z') {
			System.out.println("Uppercase");
		} else if (ch >= 'a' && ch <= 'z') {
			System.out.println("Lowercase");
		} else {
			System.out.println("Not an alphabet character");
		}

		sc.close();
	}
}
