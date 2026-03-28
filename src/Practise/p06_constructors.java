/**
 * Author: Shreyas Bhagat
 * Date: 16 Dec 2025
 * Description: Constructor Practice Problems
 */
package Practise;

public class p06_constructors {



	// ============================================================
	// Q1: Bank Account System
	// ============================================================
	// Create a BankAccount class with the following:
	// 
	// Attributes:
	//   - accountNumber (String)
	//   - accountHolderName (String)
	//   - balance (double)
	//   - accountType (String) - "Savings" or "Current"
	// 
	// Constructors:
	//   1. Default Constructor: 
	//      - Set accountNumber = "ACC000"
	//      - Set accountHolderName = "Unknown"
	//      - Set balance = 0.0
	//      - Set accountType = "Savings"
	//      - Print "Default account created."
	// 
	//   2. Parameterized Constructor (accountHolderName, balance):
	//      - Generate accountNumber = "ACC" + (random 3-digit number)
	//      - Set accountType = "Savings" (default)
	//      - Print "Savings account created for [name]."
	// 
	//   3. Parameterized Constructor (all 4 attributes):
	//      - Set all values from parameters
	//      - Print "Account created with full details."
	//
	// Methods:
	//   - displayAccountInfo(): Print all account details
	//   - deposit(double amount): Add to balance
	//   - withdraw(double amount): Deduct from balance (check sufficient funds)
	// 
	// In main():
	//   - Create 3 accounts using different constructors
	//   - Perform deposit and withdrawal operations
	//   - Display all account information
	// ============================================================



	// ============================================================
	// Q2: Employee Management System (Constructor Chaining)
	// ============================================================
	// Create an Employee class with the following:
	// 
	// Attributes:
	//   - empId (int)
	//   - name (String)
	//   - department (String)
	//   - salary (double)
	//   - joiningYear (int)
	// 
	// Constructors (Use Constructor Chaining with this()):
	//   1. Default Constructor:
	//      - Call the 2-parameter constructor with default values
	//      - empId = 0, name = "Not Assigned"
	// 
	//   2. Constructor (empId, name):
	//      - Call the 4-parameter constructor
	//      - department = "General", salary = 30000.0
	// 
	//   3. Constructor (empId, name, department, salary):
	//      - Call the 5-parameter constructor
	//      - joiningYear = current year (use java.time.Year)
	// 
	//   4. Constructor (all 5 attributes):
	//      - This is the main constructor
	//      - Initialize all attributes
	//      - Print "Employee [name] created successfully."
	// 
	// Methods:
	//   - displayEmployeeInfo(): Print all details in formatted way
	//   - calculateExperience(): Return (currentYear - joiningYear)
	//   - calculateBonus(): Return 10% of salary if experience > 5 years,
	//                       else 5% of salary
	// 
	// In main():
	//   - Create employees using all 4 constructors
	//   - Display their info, experience, and bonus
	// ============================================================



	// ============================================================
	// Q3: Online Shopping Cart (Copy Constructor & Object Interaction)
	// ============================================================
	// Create TWO classes: Product and ShoppingCart
	// 
	// === Class: Product ===
	// Attributes:
	//   - productId (String)
	//   - productName (String)
	//   - price (double)
	//   - quantity (int)
	// 
	// Constructors:
	//   1. Parameterized Constructor (all 4 attributes)
	//   2. Copy Constructor: Create a new Product by copying another
	//      - Print "Product copied: [productName]"
	// 
	// Methods:
	//   - getTotalPrice(): Return price * quantity
	//   - displayProduct(): Print product details
	// 
	// === Class: ShoppingCart ===
	// Attributes:
	//   - cartId (String)
	//   - customerName (String)
	//   - product1, product2, product3 (Product) - max 3 products
	//   - itemCount (int)
	// 
	// Constructors:
	//   1. Constructor (cartId, customerName):
	//      - Initialize cart with no products
	//      - Set itemCount = 0
	//      - Print "Shopping cart created for [customerName]"
	// 
	//   2. Copy Constructor: Create a new cart by copying another
	//      - Copy all products (use Product's copy constructor)
	//      - Generate new cartId = "CART" + (random number)
	//      - Print "Cart copied for [customerName]"
	// 
	// Methods:
	//   - addProduct(Product p): Add product if itemCount < 3
	//   - removeProduct(String productId): Remove product by ID
	//   - calculateTotal(): Return sum of all products' total prices
	//   - displayCart(): Print cart details with all products
	//   - applyDiscount(double percentage): Reduce total by percentage
	// 
	// In main():
	//   - Create 3 products
	//   - Create a shopping cart and add products
	//   - Create a copy of the cart (for a different customer)
	//   - Apply discount to original cart
	//   - Display both carts
	// ============================================================

	public static void main(String[] args) {

//		// Q1: Bank Account System
//			System.out.println("--- Using Default Constructor ---");
//			p06_BankAccount account1 = new p06_BankAccount();
//			account1.displayAccountInfo();
//			System.out.println();
//	
//			// Creating account using Parameterized Constructor (2 params)
//			System.out.println("--- Using Constructor (name, balance) ---");
//			p06_BankAccount account2 = new p06_BankAccount("John Doe", 5000.00);
//			System.out.println();
//			account2.deposit(1500.00);
//		    account2.withdraw(2000.00);
//	
//			// Creating account using Parameterized Constructor (4 params)
//			System.out.println("--- Using Constructor (all 4 attributes) ---");
//			p06_BankAccount account3 = new p06_BankAccount("ACC999", "Jane Smith", 10000.00, "Current");
//			account3.displayAccountInfo();
//			System.out.println();

		
		// Q2: Employee Management System (Constructor Chaining)
			System.out.println("--- Constructor 1: Default ---");
			p06_Employee  emp1= new p06_Employee();
			emp1.displayEmployeeInfo();
			emp1.calculateBonus();   
	        System.out.println();
	        
	        // Using 2-param Constructor
	        System.out.println("--- Constructor 2: (empId, name) ---");
	        p06_Employee  emp2= new p06_Employee(101, "John Doe");
	        emp2.displayEmployeeInfo();
	        System.out.println();
	        
	        // Using 4-param Constructor 
	        System.out.println("--- Constructor 3: (empId, name, dept, salary) ---");
	        p06_Employee emp3 = new p06_Employee(102, "Jane Smith", "Engineering", 75000.0);
	        emp3.displayEmployeeInfo();
	        emp3.calculateBonus();
	        System.out.println();

	        
	       
	        

	}

}