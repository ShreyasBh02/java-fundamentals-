/**
* Author: Shreyas Bhagat
* Date: 15 Mar 2026
* Description: Reverse a Number (Mathematical)
Problem:
	Write a program that inputs an integer (e.g., 1234) and prints its reverse (4321).
	Constraint: You cannot convert the number to a String. You must use a while loop with Modulo (%) and Division (/) operators to extract and rearrange the digits mathematically.
*/
package p07_Loops;

import java.util.Scanner;

public class Q02_ReverseNo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
		int num = sc.nextInt();
		int revNum = 0;
		int originalNum = num;
		while(num !=0){
			revNum = revNum *10 + num % 10;
			num = num/10;
		}
		System.out.println("Original Number: " + originalNum);
        System.out.println("Reversed Number: " + revNum);
        
        sc.close();
	}

}
