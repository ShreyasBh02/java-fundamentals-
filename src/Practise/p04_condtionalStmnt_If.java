/**
 * Author: Shreyas Bhagat
 * Date: 15 Dec 2025
 * Description: 
 */
package Practise;
public class p04_condtionalStmnt_If {
	// Q1: Discount Eligibility
	// A store provides a 10% discount only if the purchase amount exceeds $100.
	public boolean checkElgibility(int purcheseAmount) {
		if(purcheseAmount> 100) {
			return true;
		}
		return false;
	}


	// Q2: Warning Message
	// An industrial sensor monitors temperature. If the temperature exceeds 80°C,
	// display the message "High Temperature Alert!". Otherwise, do nothing.
	public boolean checkTemperature(int temperature) {
		if(temperature> 80) {
			return true;
		}
		return false;
	}

	// Q3: Task Completion Status
	// In a project management tool, if a task is marked as completed (isCompleted == true),
	// update the icon to a green checkmark. If false, keep the default gray circle.
	public boolean checkTaskCompletionStatus(boolean status) {
		if (status) {  
			System.out.println("✅ Green Checkmark");
			return true;  
		}
		System.out.println("⚪ Gray Circle");  
		return false;
	}
	// Q4:  Check Even/Odd: 
	// Input an integer and print "Even" if divisible by 2.
	public boolean checkEvenOrOdd( int number){
		if(number%2==0){
			return true;
		}
		return false;
	}

	// Q5:  Positive Number Check: 
	//Input a number and print "Positive" if greater than 0.
	public boolean checkPositiveNo( int number){
		if(number > 0){
			return true;
		}
		return false;
	}

	// Q6:  Password Length Check: 
	//Input a password string and print "Valid" if its length is greater than 6.
	public boolean checkLengthofPwd( int number){
		if(number>6){
			return true;
		}
		return false;
	}

	public static void main(String[] args){
		int num= 15;
		String password = "ADmin@123";
		int pwdLength = password.length();
		p04_condtionalStmnt_If classobj = new p04_condtionalStmnt_If();
		if(classobj.checkEvenOrOdd(num)== true) System.out.println("Given no "+num+ "is Even no");
		if(classobj.checkPositiveNo(num)== true) System.out.println("Given no "+num+ "is +ve no");
		if(classobj.checkLengthofPwd(pwdLength)== true) System.out.println("Given password "+password+ "having length greater than 6 char");
		if(classobj.checkElgibility(150)== true) System.out.println("Eligible for Discount");
		if(classobj.checkTemperature(85)== true) System.out.println("High Temperature Alert!");
		classobj.checkTaskCompletionStatus(true);

	}
}
