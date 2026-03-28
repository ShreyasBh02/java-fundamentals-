/**
 * Author: Shreyas Bhagat
 * Date: 14 Dec 2025
 * Description: 
 */
package Practise;

import java.util.Scanner;
/*
 * Program: Password Strength Validator
 * ------------------------------------
 * This program validates a password based on multiple criteria:
 * 1. Length check → must be greater than 4 characters (recommended ≥ 8 for stronger security).
 * 2. Special character check → must contain at least one of (!@#$%^&*_-|).
 * 3. Uppercase check → must contain at least one uppercase letter (A–Z).
 * 4. Lowercase check → must contain at least one lowercase letter (a–z).
 * 5. Digit check → must contain at least one digit (0–9).
 *
 * If all conditions are satisfied → prints "Strong password: meets all criteria".
 * Otherwise → prints "Weak password: missing criteria" and lists which rules failed.
 */
public class p04_condtionalStmnt_ValidatePWd {
	
	public boolean checkSpecialChar(String password){
		String chars = "!@#$%^&*_-|";
		for(char ch:chars.toCharArray()) {
			if (password.indexOf(ch)>=0){
				return true;
			}
		}
		return false;
	} 
	
	public boolean checkUppercase (String password){
		String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for(char ch:chars.toCharArray()) {
			if (password.indexOf(ch)>=0){
				return true;
			}
		}
		return false;
	} 
	
	public boolean checkLowercase (String password){
		String chars = "abcdefghijklmnopqrstuvwxyz";
		for(char ch:chars.toCharArray()) {
			if (password.indexOf(ch)>=0){
				return true;
			}
		}
		return false;
	} 
	
	public boolean checkOneDigit (String password){
		String chars = "0123456789";
		for(char ch:chars.toCharArray()) {
			if (password.indexOf(ch)>=0){
				return true;
			}
		}
		return false;
	}
	
	public static void main (String[] args){
		p04_condtionalStmnt_ValidatePWd obj = new p04_condtionalStmnt_ValidatePWd();
		System.out.println("Enter the password");
		Scanner sc= new Scanner (System.in);
		String checkPwd = sc.next();
		int pwdLength = checkPwd.length();
		if (pwdLength <= 4){
			System.out.println("Please enter the password length gretaer than 4");

		}
		else{
			boolean isSpecialChar= obj.checkSpecialChar(checkPwd);
			boolean isUppercase	 = obj.checkUppercase(checkPwd);
			boolean isLowercase  = obj.checkLowercase(checkPwd);
			boolean isOneDigit   = obj.checkOneDigit(checkPwd);
			
			if (isSpecialChar && isUppercase && isLowercase && isOneDigit) {
                System.out.println("Strong password: meets all criteria");
            } else {
                System.out.println("Weak password: missing criteria");
                if (!isSpecialChar) System.out.println("→ Must contain at least one special character");
                if (!isUppercase)   System.out.println("→ Must contain at least one uppercase letter");
                if (!isLowercase)   System.out.println("→ Must contain at least one lowercase letter");
                if (!isOneDigit)    System.out.println("→ Must contain at least one digit");
            }
		}
	}
}
