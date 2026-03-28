/**
* Author: Shreyas Bhagat
* Date: 15 Mar 2026
* Description:The ATM Interface
Problem:
	Create a menu-driven application that simulates a Bank ATM.
	- The program should start with an initial balance (e.g., $5000).
	- It should endlessly loop, showing the user a menu: 1. Check Balance, 2. Deposit, 3. Withdraw, 4. Exit.
	Logic:
	- If the user withdraws more than the balance, show "Insufficient Funds".
	- The program should only stop running when the user selects option 4.
	
*/
package p07_Loops;

import java.util.Scanner;

public class Q04_CC_ATMInterface {
    static double accountBalance = 5000.00;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int option = 0;
        
        System.out.println("Welcome to the Java Bank ATM");
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            
            if (sc.hasNextInt()) {
                option = sc.nextInt();
                switch(option) {
                    case 1:
                        balanceEnq();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double wAmt = sc.nextDouble();
                        withdrawAmt(wAmt);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double dAmt = sc.nextDouble();
                        depositAmt(dAmt);
                        break;
                    case 4:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a number (1-4).");
                sc.next(); 
            }
        } while (option != 4);

        sc.close();
    }
    
    public static void displayMenu() {
        System.out.println("\n--- ATM Menu ---");
        System.out.println("1. Check Balance");
        System.out.println("2. Withdraw Cash");
        System.out.println("3. Deposit Cash");
        System.out.println("4. Exit");
    }
    
    public static void balanceEnq() {
        System.out.printf("Current Balance: $%.2f\n", accountBalance);
    }
    
    public static void withdrawAmt(double amount) {
        if (amount <= 0) {
            System.out.println("Error: Amount must be positive.");
        } else if (amount > accountBalance) {
            System.out.println("Insufficient Funds!");
        } else {
            accountBalance -= amount;
            System.out.printf("Withdrawal Successful! New Balance: $%.2f\n", accountBalance);
        }
    }

    public static void depositAmt(double amount) {
        if (amount > 0) {
            accountBalance += amount;
            System.out.printf("Deposit Successful! New Balance: $%.2f\n", accountBalance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
}
