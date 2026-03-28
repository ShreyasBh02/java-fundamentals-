/**
* Author: Shreyas Bhagat
* Date: 21 Dec 2025
* Description: 
*/
package Practise;

import java.util.Random;

public class p06_BankAccount {
	public String accountNumber;
	public String accountHolderName;
	public double balance;
	public String accountType;
	
	public p06_BankAccount(){
		this.accountNumber = "ACC00101";
		this.accountHolderName = "Jhon Doe";
		this.balance = 100.20;
		this.accountType = "Saving";
		System.out.println("Default account created.");
	}
	
	public p06_BankAccount(String accountHolderName, double balance){
		Random random = new Random();		
		int randomNum = random.nextInt(900) +100;
		
		this.accountNumber = "ACC" + randomNum;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = "Saving";
		System.out.println("Savings account created for: "+this.accountHolderName  );
	
	}
	
	public p06_BankAccount(String accountNumber, String accountHolderName, double balance, String accountType){
		this.accountNumber = accountNumber;
		this.accountHolderName = accountHolderName;
		this.balance = balance;
		this.accountType = accountType;
		System.out.println(this.accountType+" account created for: "+this.accountHolderName  );
	
	}
	
	public void displayAccountInfo(){
		System.out.printf("║  Account No   : %-22s ║%n", accountNumber);
        System.out.printf("║  Holder Name  : %-22s ║%n", accountHolderName);
        System.out.printf("║  Balance      : $%-21.2f ║%n", balance);
        System.out.printf("║  Account Type : %-22s ║%n", accountType);
		
	}

	public void deposit(double amount){
		
		if(amount <= 0){
			System.out.printf("Enter the amount greater than 0");
			return;
		}
		balance = balance +amount;
		System.out.println("✅ Deposited: $" + amount + " | New Balance: $" + balance);
		
	}

	public void withdraw(double amount){
		
		if(amount <= 0){
			System.out.printf("Enter the amount greater than 0");
			return;
		}
		
		if(amount > balance){
			System.out.println("❌ Insufficient funds! Available Balance: $" + balance);
            return;
		}
		balance = balance - amount;
		System.out.println("✅ Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
		
	}
	
	public String getAccountNumber() {
        return accountNumber;
    }
    
    public String getAccountHolderName() {
        return accountHolderName;
    }
    
    public double getBalance() {
        return balance;
    }
    
    public String getAccountType() {
        return accountType;
    }
}
