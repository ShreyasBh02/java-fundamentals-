/**
* Author: Shreyas Bhagat
* Date: 15 Mar 2026
* Description: Tiered Electricity Bill Calculator
Problem:
	An electricity board charges the following rates for the use of electricity based on the number of units consumed:
	- First 100 units: Free (Cost: 0)
	- Next 100 units (101-200): $5 per unit
	- Next 100 units (201-300): $10 per unit
	- Above 300 units: $15 per unit
	Write a program to calculate the total bill based on the input units.
	Input: 350
	LLogic: (100*0) + (100*5) + (100*10) + (50*15)
	Output: Total Bill: $2250
*/
package p06_CondtionalSt;

import java.util.Scanner;

public class Q03_ElectricityBillCal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Units:");
        int unit = sc.nextInt();
        double bill = 0;
        
        if (unit <= 100) {
            bill = 0;
        } 
        else if (unit <= 200) {
            bill = 0 + (unit - 100) * 5;
        } 
        else if (unit <= 300) {
            bill = 0 + (100 * 5) + (unit - 200) * 10;
        } 
        else {
            bill = 0 + (100 * 5) + (100 * 10) + (unit - 300) * 15;
        }
        
        System.out.println("Total Bill: $" + (int)bill);
        sc.close();

	}

}
