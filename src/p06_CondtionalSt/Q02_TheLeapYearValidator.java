/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
* Description:The Leap Year Validator
Problem:
	Write a program to verify if a specific year is a Leap Year.
	The Logic:
	- A year is a leap year if it is divisible by 4.
	- However, if the year is divisible by 100, it is not a leap year, unless...
	- The year is also divisible by 400.
	Input: 2000 -> Output: Leap Year
	Input: 1900 -> Output: Not a Leap Year 
*/
package p06_CondtionalSt;

import java.util.Scanner;

public class Q02_TheLeapYearValidator {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Year to verify if a specific year is a Leap Year:");
        if (sc.hasNextInt()) {
            int year = sc.nextInt();
            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year");
            } else {
                System.out.println(year + " is Not a Leap Year");
            }
        } else {
            System.out.println("Please enter a valid numeric year.");
        }
        
        sc.close();
    }
}