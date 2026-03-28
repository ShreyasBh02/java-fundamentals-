/**
 * Author: Shreyas Bhagat
 * Date: 16 Dec 2025
 * Description: 
 */
package Practise;
public class p05_combineProb {



	public static void main(String[] args){
		p05_combineProb obj = new p05_combineProb();

		/*
		// Q1: ATM Withdrawal
		System.out.println(obj.atmWithdrawal(1234,1245,500,5000));
		System.out.println(obj.atmWithdrawal(1234,1234,500,5000));
		System.out.println(obj.atmWithdrawal(1234,1234,5001,5000));

		//Q2: Student Result System
		obj.studentResultSystem(91);
		obj.studentResultSystem(1);
		obj.studentResultSystem(75.5);

		// Q3: Menu-Driven Program
		obj.menuDrivenProgram(1,5);
		obj.menuDrivenProgram(2,5);
		obj.menuDrivenProgram(3,-5);

		// Q4: Online Ordering System
		System.out.println("=== Test 1: Not Logged In ===");
		obj.onlineOrderingSystem(false, false, 3, "credit");

		System.out.println("\n=== Test 2: Empty Cart ===");
		obj.onlineOrderingSystem(true, false, 0, "credit");

		System.out.println("\n=== Test 3: Normal Purchase ===");
		obj.onlineOrderingSystem(true, false, 3, "credit");

		System.out.println("\n=== Test 4: Premium Member with 5+ items ===");
		obj.onlineOrderingSystem(true, true, 6, "paypal");

		System.out.println("\n=== Test 5: Invalid Payment Method ===");
		obj.onlineOrderingSystem(true, false, 2, "bitcoin");


		// Q5: Event Ticket Purchase

	    System.out.println("\n=== Test 1: Invalid Quantity (>10) ===");
	    obj.eventTicketPurchase(25, 15, "sports");

	    System.out.println("\n=== Test 2: Sports Event ===");
	    obj.eventTicketPurchase(25, 4, "sports");

	    System.out.println("\n=== Test 3: Theater Event ===");
	    obj.eventTicketPurchase(30, 2, "theater");

	    System.out.println("\n=== Test 4: Music Event (With Discount - 5+ tickets) ===");
	    obj.eventTicketPurchase(22, 6, "music");

		 */
		//Q6: Employee Performance Evaluation

		System.out.println("=== Test 1: Invalid Score ===");
		obj.employeePerformanceEvaluation(-5, "Sales");

		System.out.println("=== Test 2: Sales - Excellent ===");
		obj.employeePerformanceEvaluation(95, "Sales");

		System.out.println("=== Test 3: Engineering - Excellent (score >= 95) ===");
		obj.employeePerformanceEvaluation(97, "Engineering");

		System.out.println("=== Test 4: Engineering - Excellent (score < 95) ===");
		obj.employeePerformanceEvaluation(92, "Engineering");

	}


	// ============================================================
	// Q1: ATM Withdrawal
	// ============================================================
	// Input PIN and withdrawal amount.
	// - If PIN correct → check balance.
	//   - If balance ≥ amount → "Transaction Successful"
	//   - Else → "Insufficient Balance"
	// - Else → "Invalid PIN"
	// ============================================================

	public String atmWithdrawal(int enteredPIN, int actualPIN,double withdrawalamount, double currentBalance){
		if(enteredPIN == actualPIN){
			if(withdrawalamount <= currentBalance){
				String msg= "Transaction Successful. The amount " +withdrawalamount+" has been sucessfully debited. Current balance is "+ (currentBalance - withdrawalamount);
				return msg;
			}
			else{
				return "Insufficient Balance. Current balance is "+ currentBalance;
			}
		}
		return "Invalid PIN";

	}

	// ============================================================
	// Q2: Student Result System
	// ============================================================
	// Input marks.
	// - If marks < 40 → "Fail"
	// - Else → use nested if:
	//   - If marks ≥ 90 → "Grade A"
	//   - Else if marks ≥ 75 → "Grade B"
	//   - Else → "Grade C"
	// - Use switch to print "Scholarship Eligible" if Grade A or B.
	// ============================================================

	public void studentResultSystem(double marks){
		String grade;
		if(marks < 40){
			System.out.println("Fail");
			grade ="D";
		}
		else{
			if(marks >= 90){
				grade ="A";
			}
			else if(marks >= 75 ){
				grade ="B";
			}
			else{
				grade ="C";
			}
		}
		System.out.println("Grade: " + grade);  
		switch(grade){
		case "A":
			System.out.println("Scholarship Eligible");
			break;
		case "B":
			System.out.println("Scholarship Eligible");
			break;
		default:
			System.out.println("Not Eligible for Scholarship");
			break;

		}
	}


	// ============================================================
	// Q3: Menu-Driven Program
	// ============================================================
	// Input choice (1–4).
	// - Switch for menu options:
	//   - 1 → Check Even/Odd
	//   - 2 → Check Prime
	//   - 3 → Check Positive/Negative
	//   - 4 → Exit
	// - Inside each case, use if/if-else/nested if logic to solve.
	// ============================================================
	public void menuDrivenProgram(int menu, int num){
		switch(menu){
		case 1: // Even/Odd
			if (num % 2 == 0) {
				System.out.println(num + " is Even");
			} else {
				System.out.println(num + " is Odd");
			}
			break;

		case 2: // Prime
			boolean prime = true;
			if (num <= 1) {
				prime = false;
			} else {
				for (int i = 2; i <= num / 2; i++) {
					if (num % i == 0) {
						prime = false;
						break;
					}
				}
			}
			System.out.println(prime ? num + " is Prime" : num + " is Not Prime");
			break;

		case 3: // Positive/Negative
			if (num > 0) {
				System.out.println(num + " is Positive");
			} else if (num < 0) {
				System.out.println(num + " is Negative");
			} else {
				System.out.println("Number is Zero");
			}
			break;

		default:
			System.out.println("Invalid Choice");
		}

	}


	// ============================================================
	// Q4: Online Ordering System
	// ============================================================
	// A customer wants to place an order.
	// - First, check if they are loggedIn (if-else).
	// - If logged in, prompt for itemCount and paymentMethod 
	//   (e.g., "credit", "paypal", "cash_on_delivery").
	// - If itemCount is 0, display "Cart is empty." (if).
	// - Otherwise, calculate totalAmount = itemCount * 10 
	//   (assume $10 per item).
	// - Apply a discount: If the itemCount is 5 or more AND 
	//   the customer is a premiumMember, apply a 10% discount 
	//   on the totalAmount (nested if).
	// - Process payment based on paymentMethod (switch):
	//   - "credit": Print "Processing Credit Card..."
	//   - "paypal": Print "Redirecting to PayPal..."
	//   - "cash_on_delivery": Print "Order placed. Pay on delivery."
	//   - Default: Print "Invalid payment method. Order cancelled."
	// - If itemCount was 0, or payment failed, ensure no 
	//   payment message is printed.
	// ============================================================

	public void onlineOrderingSystem(boolean isLogin,boolean premiumMember, int itemCount, String paymentMethod){
		double totalAmount;
		double discount= 0.1;
		boolean paymentSuccess= false;
		if(!isLogin){
			System.out.println("Please log in to the application before purchasing this product.");
			return;
		}

		if(itemCount ==0 ){
			System.out.println("Your cart is empty. Please add items to proceed with checkout.");
			return; 
		}
		else{
			totalAmount = itemCount *10;
			System.out.println("Total amount to be paid: $" + totalAmount);
			if(itemCount >=5 && premiumMember){
				totalAmount = totalAmount- totalAmount*discount;
				System.out.println("Final payable amount after discount: $" + totalAmount);
			}
		}
		switch (paymentMethod) {  
		case "credit":   
			System.out.println("💳 Processing Credit Card...");
			paymentSuccess = true;
			break;

		case "paypal":        
			System.out.println("🅿️ Redirecting to PayPal...");
			paymentSuccess = true;
			break;

		case "cash_on_delivery":
			System.out.println("📦 Order placed. Pay on delivery.");
			paymentSuccess = true;
			break;

		default:
			System.out.println("❌ Invalid payment method. Order cancelled.");
			paymentSuccess = false;
			break;

		}

		if (paymentSuccess) {
			System.out.println("✅ Order confirmed! Thank you for shopping.");
		}
	}



	// ============================================================
	// Q5: Event Ticket Purchase
	// ============================================================
	// A user wants to buy tickets.
	// - First, check their age. If age < 18, they cannot buy 
	//   tickets without adult supervision, print 
	//   "Adult supervision required." (if-else).
	// - If age >= 18, prompt for ticketQuantity and eventCategory 
	//   ("music", "sports", "theater").
	// - Validate ticketQuantity: if ticketQuantity <= 0 or 
	//   ticketQuantity > 10, print "Invalid ticket quantity." (if).
	// - If quantity is valid, calculate basePrice per ticket 
	//   using switch based on eventCategory:
	//   - "music": $50
	//   - "sports": $30
	//   - "theater": $40
	//   - Default (invalid category): Print "Invalid event category. 
	//     Purchase cancelled." (and stop further processing).
	// - Calculate finalPrice = basePrice * ticketQuantity.
	// - Apply a special offer: If eventCategory is "music" AND 
	//   ticketQuantity is 5 or more, give an extra $5 discount 
	//   per ticket (nested if).
	// - Finally, print "Total cost: $" followed by finalPrice 
	//   or "Purchase cancelled." based on previous validations.
	// ============================================================

	public void eventTicketPurchase(int age, int ticketQuantity, String eventCategory){

		double totalAmount = 0;
		double ticketAmount = 0;
		double discountPerTicket = 5; 
		boolean paymentSuccess = false;


		if (age < 18) {
			System.out.println("🔞 Adult supervision required.");
			return;
		}

		if (ticketQuantity <= 0 || ticketQuantity > 10) {
			System.out.println("❌ Invalid ticket quantity. Must be 1-10.");
			return;
		}
		else{
			switch (eventCategory) {  
			case "music":
				ticketAmount =50;
				totalAmount = ticketAmount*ticketQuantity;
				if(ticketQuantity>=5){
					totalAmount = ticketAmount*ticketQuantity - discountPerTicket*ticketQuantity;
				}
				paymentSuccess = true;
				break;

			case "sports":  
				ticketAmount =30;	
				totalAmount = ticketAmount*ticketQuantity;
				paymentSuccess = true;
				break;

			case "theater":
				ticketAmount =40;
				totalAmount = ticketAmount*ticketQuantity;
				paymentSuccess = true;
				break;

			default:
				System.out.println("❌ Invalid event category. Purchase cancelled.");
				paymentSuccess = false;
				break;
			}
		}

		if (paymentSuccess) {
			System.out.println("Final payable amount after discount: $" + totalAmount);
		}
	}

	// ============================================================
	// Q6: Employee Performance Evaluation
	// ============================================================
	// An employee's performance is evaluated based on their 
	// score (0-100) and department ("Sales", "HR", "Engineering").
	// 
	// - First, validate the score: If score < 0 or score > 100, 
	//   print "Invalid score." (if-else).
	// 
	// - If score is valid, determine their performanceRating 
	//   using if-else if-else chain:
	//   - 90-100: "Excellent"
	//   - 70-89: "Good"
	//   - 50-69: "Average"
	//   - Below 50: "Needs Improvement"
	// 
	// - Now, based on department and performanceRating, provide 
	//   specific feedback (switch and nested if):
	// 
	//   Switch on department:
	//   
	//   Case "Sales":
	//     - If performanceRating is "Excellent", print 
	//       "Great job exceeding targets!" (nested if).
	//     - Else if "Needs Improvement", print 
	//       "Focus on improving sales figures."
	//   
	//   Case "HR":
	//     - If performanceRating is "Good" or "Excellent", print 
	//       "Maintaining a positive work environment." 
	//       (nested if with OR).
	//     - Else print "Reviewing employee relations."
	//   
	//   Case "Engineering":
	//     - If performanceRating is "Excellent" AND score is 95 
	//       or above, print "Exceptional technical contribution!" 
	//       (nested if with AND).
	//     - Else if "Needs Improvement", print 
	//       "Work on coding skills and project delivery."
	//   
	//   Default: Print "Department-specific feedback not available."
	// 
	// - Finally, if the score was below 50, regardless of 
	//   department, print a general warning: 
	//   "Mandatory training required." (if).
	// ============================================================

	public void employeePerformanceEvaluation(int score, String department) {

		String performanceRating;

		if (score < 0 || score > 100) {
			System.out.println("❌ Invalid score. Must be 0-100.");
			return;
		}

		if (score >= 90) {
			performanceRating = "Excellent";
		} 
		else if (score >= 70) {
			performanceRating = "Good";
		} 
		else if (score >= 50) {
			performanceRating = "Average";
		} 
		else {
			performanceRating = "Needs Improvement";
		}

		switch (department) {
		case "Sales":
			if (performanceRating.equals("Excellent")) {
				System.out.println("Great job exceeding targets! 🎯");
			} 
			else if (performanceRating.equals("Needs Improvement")) {
				System.out.println("Focus on improving sales figures. 📉");
			}
			else {
				System.out.println("Keep working on your sales skills.");
			}
			break;

		case "HR":
			if (performanceRating.equals("Excellent") || performanceRating.equals("Good")) {
				System.out.println("Maintaining a positive work environment. 😊");
			} 
			else {
				System.out.println("Reviewing employee relations. 🔍");
			}
			break;

		case "Engineering":
			if (performanceRating.equals("Excellent") && score >= 95) {
				System.out.println("Exceptional technical contribution! 🚀");
			} 
			else if (performanceRating.equals("Needs Improvement")) {
				System.out.println("Work on coding skills and project delivery. 💻");
			}
			else {
				System.out.println("Good technical work. Keep improving.");
			}
			break;

		default:
			System.out.println("Department-specific feedback not available.");
			break;
		}

		if (score < 50) {
			System.out.println("⚠️  WARNING: Mandatory training required!");
		}
	}




}
