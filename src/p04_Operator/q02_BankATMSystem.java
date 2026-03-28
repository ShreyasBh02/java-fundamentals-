/**
* Author: Shreyas Bhagat
* Date: 30 Jan 2026
* Description: 
* 
## PROBLEM 2 : INTERMEDIATE LEVEL – BANK ATM SYSTEM

Problem Title:
ATM Transaction and Account Management System

Scenario:
Develop a Java program that simulates an ATM system with
secure authentication and multiple banking operations.
The system validates transactions, updates balances,
and enforces withdrawal rules.

Input Required:
	* Account PIN
	* Account Balance
	* User Menu Choice
	* Transaction Amount (withdraw / deposit)

Processing Logic:

	1. PIN Authentication
	   * Maximum of 3 attempts allowed
	   * Validate PIN using comparison operators
	   * Block access after 3 failed attempts
	   * Track attempts using increment operator
	
	2. Cash Withdrawal Validation
	   * Amount must be a multiple of 100
	   * Daily withdrawal limit must not exceed 25,000
	   * Minimum balance after deduction and service charge (10)
	     must be at least 1,000
	   * Use logical operators to validate conditions
	
	3. Transaction Processing
	   * Deduct withdrawal amount and service charge
	   * Calculate currency notes:
	     2000, 500, 200, 100
	   * Update daily withdrawal tracker
	   * Increment transaction count
	
	4. Menu Operations
	   * Display options:
	     1. Balance Enquiry
	     2. Withdraw Cash
	     3. Deposit Cash
	     4. Fund Transfer
	     5. Mini Statement
	     6. Change PIN
	     7. Exit
	   * Use switch-case control structure

Output Required:
	* Transaction success or failure message
	* Updated account balance
	* Currency denomination details
	* Total number of transactions
	* Error messages for invalid actions
*/
	
package p04_Operator;

import java.util.Scanner;

public class q02_BankATMSystem {

		static double accountBalance = 50000;
		static int correctAccountPIN = 1234;
		static int transactionCount = 0;
		static double dailyWithdrawalTotal = 0;
		static final int DAILY_LIMIT = 25000;
		static final int SERVICE_CHARGE = 10;
		static final int MIN_BALANCE = 1000;

		static String[] miniStatementHistory = new String[5];
		static int statementIndex = 0;
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1. PIN Authentication
			boolean isAuthenticated = authenticateUser(sc);
				
			if (!isAuthenticated) {
				System.out.println("Access blocked. Too many failed attempts.");
				sc.close();
				return; 
			}
			
			System.out.println("Access granted");
	
			// 4. Menu Operations
			int choice;
			do {
				displayMenu();
				System.out.print("Enter your choice: ");
				choice = sc.nextInt();

				switch (choice) {
					case 1:
						balanceEnquiry();
						break;
					case 2:
						System.out.print("Enter withdrawal amount: ");
						double wAmt = sc.nextDouble();
						withdrawCash(wAmt);
						break;
					case 3:
						System.out.print("Enter deposit amount: ");
						double dAmt = sc.nextDouble();
						depositCash(dAmt);
						break;
					case 4:
						System.out.print("Enter transfer amount: ");
						double tAmt = sc.nextDouble();
						fundTransfer(tAmt);
						break;
					case 5:
						miniStatement();
						break;
					case 6:
						changePIN(sc);
						break;
					case 7:
						System.out.println("Thank you for using ATM. Goodbye!");
						break;
					default:
						System.out.println("Invalid choice. Try again.");
				}
			} while (choice != 7);

			sc.close();
		}
	
	public static boolean authenticateUser(Scanner sc) {
		int attempts = 0;
		final int MAX_ATTEMPTS = 3;
		
		while (attempts < MAX_ATTEMPTS) {
			System.out.print("Enter your PIN: ");
			int enteredPIN = sc.nextInt();
			
			if (authenticatePIN(enteredPIN, correctAccountPIN)) {
				return true;
			} else {
				attempts++;
				int attemptsLeft = MAX_ATTEMPTS - attempts;
				if (attemptsLeft > 0) {
					System.out.println("Incorrect PIN. Attempts left: " + attemptsLeft);
				}
			}
		}
		
		return false;
	}
	
	public static boolean authenticatePIN(int enteredPIN, int actualPIN) {
		return (enteredPIN == actualPIN);
	}
	
	public static void displayMenu() {
		System.out.println("\n=== ATM Menu ===");
		System.out.println("1. Balance Enquiry");
		System.out.println("2. Withdraw Cash");
		System.out.println("3. Deposit Cash");
		System.out.println("4. Fund Transfer");
		System.out.println("5. Mini Statement");
		System.out.println("6. Change PIN");
		System.out.println("7. Exit");
	}
	
	public static void balanceEnquiry() {
		System.out.println("Current Balance: $" + String.format("%.2f", accountBalance));
		System.out.println("Daily Withdrawal Used: $" + String.format("%.2f", dailyWithdrawalTotal) + " / $" + DAILY_LIMIT);
		addToMiniStatement("Balance Enquiry - Balance: $" + String.format("%.2f", accountBalance));
	}
	
	public static void withdrawCash(double amount) {
		System.out.println("\n--- Cash Withdrawal ---");
		
		if (cashWithdrawalValidation(amount)) {
			accountBalance -= (amount + SERVICE_CHARGE);
			dailyWithdrawalTotal += amount;
			transactionCount++;
			
			System.out.println("Withdrawal Successful!");
			System.out.println("Amount Withdrawn: $" + String.format("%.2f", amount));
			System.out.println("Service Charge: $" + SERVICE_CHARGE);
			System.out.println("Total Deducted: $" + String.format("%.2f", (amount + SERVICE_CHARGE)));
			System.out.println("New Balance: $" + String.format("%.2f", accountBalance));
			
			calculateCurrencyNotes((int)amount);
			
			addToMiniStatement("Withdrawal: $" + String.format("%.2f", amount) + " | Balance: $" + String.format("%.2f", accountBalance));
		}
	}
	public static boolean cashWithdrawalValidation(double transactionAmount) {
		if (transactionAmount <= 0) {
			System.out.println("Amount must be greater than 0");
			return false;
		}
		
		if (transactionAmount % 100 != 0) {
			System.out.println("Amount must be a multiple of 100");
			return false;
		}
		
		if (transactionAmount > accountBalance) {
			System.out.println("Insufficient funds! Available Balance: $" + String.format("%.2f", accountBalance));
			return false;
		}
		
		if (dailyWithdrawalTotal + transactionAmount > DAILY_LIMIT) {
			System.out.println("Daily withdrawal limit exceeded!");
			System.out.println("Daily Limit: $" + DAILY_LIMIT);
			System.out.println("Already Withdrawn Today: $" + String.format("%.2f", dailyWithdrawalTotal));
			System.out.println("Remaining Limit: $" + String.format("%.2f", (DAILY_LIMIT - dailyWithdrawalTotal)));
			return false;
		}
		
		double balanceAfterWithdrawal = accountBalance - transactionAmount - SERVICE_CHARGE;
		if (balanceAfterWithdrawal < MIN_BALANCE) {
			System.out.println("Insufficient balance! Minimum balance of $" + MIN_BALANCE + " must be maintained");
			System.out.println("Balance after withdrawal would be: $" + String.format("%.2f", balanceAfterWithdrawal));
			return false;
		}
		
		return true;
	}
	

	public static void calculateCurrencyNotes(int amount) {
		System.out.println("Currency Denomination:");
		int[] denominations = {2000, 500, 200, 100};
		int[] noteCount = new int[denominations.length];
		
		int remainingAmount = amount;
		
		for (int i = 0; i < denominations.length; i++) {
			if (remainingAmount >= denominations[i]) {
				noteCount[i] = remainingAmount / denominations[i];
				remainingAmount = remainingAmount % denominations[i];
			}
		}
		
		for (int i = 0; i < denominations.length; i++) {
			if (noteCount[i] > 0) {
				System.out.println("$" + denominations[i] + " notes: " + noteCount[i]);
			}
		}
		System.out.println();
	}
	
	public static void depositCash(double amount) {
		System.out.println("\n--- Cash Deposit ---");
		
		if (amount <= 0) {
			System.out.println("Amount must be greater than 0");
			return;
		}
		
		if (amount % 100 != 0) {
			System.out.println("Amount must be a multiple of 100");
			return;
		}
		
		accountBalance += amount;
		transactionCount++;
		
		System.out.println("Deposit Successful!");
		System.out.println("Amount Deposited: $" + String.format("%.2f", amount));
		System.out.println("New Balance: $" + String.format("%.2f", accountBalance));
		
		addToMiniStatement("Deposit: $" + String.format("%.2f", amount) + " | Balance: $" + String.format("%.2f", accountBalance));
	}
	
	
	public static void fundTransfer(double amount) {
		System.out.println("\n--- Fund Transfer ---");
		
		if (amount <= 0) {
			System.out.println("Amount must be greater than 0");
			return;
		}
		
		if (amount > accountBalance) {
			System.out.println("Insufficient funds! Available Balance: $" + String.format("%.2f", accountBalance));
			return;
		}
		
		double balanceAfterTransfer = accountBalance - amount - SERVICE_CHARGE;
		if (balanceAfterTransfer < MIN_BALANCE) {
			System.out.println("Insufficient balance! Minimum balance of $" + MIN_BALANCE + " must be maintained");
			System.out.println("Balance after transfer would be: $" + String.format("%.2f", balanceAfterTransfer));
			return;
		}
		
		accountBalance -= (amount + SERVICE_CHARGE);
		transactionCount++;
		
		System.out.println("Transfer Successful!");
		System.out.println("Amount Transferred: $" + String.format("%.2f", amount));
		System.out.println("Service Charge: $" + SERVICE_CHARGE);
		System.out.println("Total Deducted: $" + String.format("%.2f", (amount + SERVICE_CHARGE)));
		System.out.println("New Balance: $" + String.format("%.2f", accountBalance));
		
		addToMiniStatement("Transfer: $" + String.format("%.2f", amount) + " | Balance: $" + String.format("%.2f", accountBalance));
	}
	

	public static void miniStatement() {
		System.out.println("\n═════════MINI STATEMENT═════════");
		System.out.println("Total Transactions: " + transactionCount);
		System.out.println("Current Balance: $" + String.format("%.2f", accountBalance));
		System.out.println("\nLast 5 Transactions:");
		
		boolean hasTransactions = false;
		for (int i = 0; i < miniStatementHistory.length; i++) {
			if (miniStatementHistory[i] != null) {
				System.out.println((i + 1) + ". " + miniStatementHistory[i]);
				hasTransactions = true;
			}
		}
		if (!hasTransactions) {
			System.out.println("No transactions yet.");
		}
	}
	

	public static void addToMiniStatement(String transaction) {
		miniStatementHistory[statementIndex] = transaction;
		statementIndex = (statementIndex + 1) % 5;
	}
	

	public static void changePIN(Scanner sc) {
		System.out.println("\n--- Change PIN ---");
		System.out.print("Enter current PIN: ");
		int currentPIN = sc.nextInt();
		
		if (!authenticatePIN(currentPIN, correctAccountPIN)) {
			System.out.println("Incorrect current PIN!");
			return;
		}
		
		System.out.print("Enter new PIN (4 digits): ");
		int newPIN = sc.nextInt();
		
		if (newPIN < 1000 || newPIN > 9999) {
			System.out.println(" PIN must be 4 digits!");
			return;
		}
		
		System.out.print("Confirm new PIN: ");
		int confirmPIN = sc.nextInt();
		
		if (newPIN != confirmPIN) {
			System.out.println("PINs do not match!");
			return;
		}
		
		correctAccountPIN = newPIN;
		transactionCount++;
		System.out.println("PIN changed successfully!");
		
		addToMiniStatement("PIN Changed");
	}
}
