/**
* Author: Shreyas Bhagat
* Date: 15 Mar 2026
* Description: Multiplication Table Generator
Problem:
	Write a program that takes an integer N as input. Using a for loop, print the multiplication table for that number from 1 to 10.
	Input: 5
	Output:
	5 x 1 = 5
	...
	5 x 10 = 50
	
*/
package p07_Loops;

import java.util.Scanner;

public class Q01_PrintTable {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the no:");
		int number = sc.nextInt();
		System.out.println("Multiplication Table for " + number + ":");
		for(int i =1; i <=10; i++){
			System.out.println(number + " x "+ i +" = "+number*i);
		
		}
		sc.close();
	}
}
