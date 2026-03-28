/**
 * Author: Shreyas Bhagat
 * Date: 15 Dec 2025
 * Description: 
 */
package Practise;
public class p04_condtionalStmnt_NestedIf {
	// Q1: Eligibility for Premium Membership
	// A user can upgrade to premium membership if they are an active subscriber AND have paid at least $50.
	// Outer Condition: isActiveSubscriber
	// Inner Condition (if active): totalPaidAmount >= 50
	// Outcomes: Premium upgrade, Basic Premium suggestion, or Subscribe prompt.
	
	public String checkPremiumMembership(int totalPaidAmount, boolean isActiveSubscriber) {
		if(isActiveSubscriber ==true) {
			if(totalPaidAmount>=50) {
				return "Eligible for Premium Membership";
			}
			else {
				return "Consider upgrading your payment to access Premium Membership";
			}
		}
		return "Consider upgrading your payment to access Premium Membership";
	}

	// Q2: Leap Year Check
	// Determine if a given year is a leap year.
	// A year is a leap year if divisible by 4,
	// unless it is divisible by 100 but not by 400.
	// Outer Condition: year % 4 == 0
	// Inner Conditions (if divisible by 4): year % 100 != 0 OR year % 400 == 0
	// Outcomes: "Leap Year" or "Not a Leap Year"
	public String checkLeapYear(int year) {
		
		if(year %4==0) {
			if(year %100 !=0 || year%400 ==0) {
				return "Leap Year";
			}
			else {
				return "Not a Leap Year";
			}
		}
		return "Not a Leap Year";
	}

	// Q3: Delivery Fee Calculation
	// Calculate delivery fee based on distance and itemWeight.
	// If distance < 10 km:
	//	    If itemWeight < 5 kg → fee = $5
	//	    Else (itemWeight ≥ 5 kg) → fee = $10
	// If distance ≥ 10 km:
	//	    If itemWeight < 5 kg → fee = $15
	//	    Else (itemWeight ≥ 5 kg) → fee = $20
	// Outer Condition: distance < 10
	// Inner Condition: itemWeight < 5
	// Outcomes: Different delivery fees
	
	
	public int calculateFee(int distance, int itemWeight) {
		int fee = 0;
		if (distance < 10) {
			if (itemWeight < 5) {
				fee = 5;
			} else {
				fee = 10;
			}
		} else {
			if (itemWeight < 5) {
				fee = 15;
			} else {
				fee = 20;
			}
		}
		return fee;
	}
	

	public static void main(String[] args) {
		p04_condtionalStmnt_NestedIf obj = new p04_condtionalStmnt_NestedIf();

		// Test Q1
		System.out.println(obj.checkPremiumMembership(60, true)); 
		System.out.println(obj.checkPremiumMembership(40, true)); 
		System.out.println(obj.checkPremiumMembership(30, false)); 

		// Test Q2
		System.out.println(obj.checkLeapYear(2020)); // Leap Year
		System.out.println(obj.checkLeapYear(1900)); // Not a Leap Year

		// Test Q3
		System.out.println("Delivery Fee: $" + obj.calculateFee(5, 3)); // Delivery Fee: $5
		System.out.println("Delivery Fee: $" + obj.calculateFee(5, 6)); // Delivery Fee: $10
		System.out.println("Delivery Fee: $" + obj.calculateFee(15, 3)); // Delivery Fee: $15
		System.out.println("Delivery Fee: $" + obj.calculateFee(15, 6)); // Delivery Fee: $20
	}

}
