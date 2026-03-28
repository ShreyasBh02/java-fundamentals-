/**
* Author: Shreyas Bhagat
* Date: 1 Feb 2026
* Description: 
* ========================================
        PROGRAM 1: LEVEL 1 (BASIC)
========================================
----------------------------------------
OBJECTIVE
----------------------------------------
Create a Java program that demonstrates your understanding 
of all 8 primitive data types in Java. The program should 
declare, initialize, and display variables of each type 
along with their practical use cases.

----------------------------------------
REQUIREMENTS
----------------------------------------
1. Declare and Initialize Variables for ALL 8 Primitive Types:
   - byte   → Store a small number (e.g., age in years)
   - short  → Store a medium-range number (e.g., year of birth)
   - int    → Store a standard integer (e.g., population count)
   - long   → Store a large number (e.g., phone number or file size)
   - float  → Store a decimal with single precision (e.g., temperature)
   - double → Store a decimal with double precision (e.g., scientific value like PI)
   - char   → Store a single character (e.g., grade or initial)
   - boolean→ Store true/false (e.g., is student enrolled?)

2. Display Each Variable:
   - Print the variable name, value, and a brief description of its use case

3. Perform Basic Arithmetic Operations:
   - Take two integer values
   - Perform Addition, Subtraction, Multiplication, Division, and Modulus
   - Display results

4. Demonstrate String (Reference Type):
   - Declare a String variable
   - Concatenate two strings
   - Display the length of a string

5. Show Integer Division vs Decimal Division:
   - Demonstrate that 10 / 3 gives 3 (integer)
   - Show how to get accurate result using type casting

----------------------------------------
EXPECTED OUTPUT FORMAT
----------------------------------------
========================================
   JAVA PRIMITIVE DATA TYPES - BASICS   
========================================

1. BYTE
   Value: [your value]
   Use: [your description]

2. SHORT
   Value: [your value]
   Use: [your description]

... continue for all 8 types ...

========================================
         ARITHMETIC OPERATIONS           
========================================
num1 = 10, num2 = 3
Addition: 13
Subtraction: 7
... other operations ...

----------------------------------------
CONSTRAINTS
----------------------------------------
- Use meaningful variable names (not a, b, x)
- Add comments explaining each data type
- Use proper formatting for output
- Do NOT use Scanner (hardcode values for this exercise)

----------------------------------------
BONUS CHALLENGE
----------------------------------------
- Display a Unicode character using \\u notation
- Show what happens when you try to store 130 in a byte variable

*/
package p02_Variable;
public class q01_BasicDataTypes {

	public static void main(String[] args) {
		// 1.  Declare and Initialize Variables for ALL 8 Primitive Types:
		byte myByte = 10;
		short myShort = 30000;
		int myInt = 10_00_000;
		long myLong = 231_0789_7495L;
		float  myFloat = 15.17f;
		double myDouble = 5414.12;
		char myChar = 'J';
		boolean myBoolean = true;
		
		// 2. Display Each Variable:
        System.out.println("   Value (byte): " + myByte);    
        System.out.println("   Value (short): " + myShort);
        System.out.println("   Value (int): " + myInt);    
        System.out.println("   Value (long): " + myLong);
        System.out.println("   Value (float): " + myFloat);    
        System.out.println("   Value (double): " + myDouble);
        System.out.println("   Value (char): " + myChar);    
        System.out.println("   Value (boolean): " + myBoolean);

		// 3. Perform Basic Arithmetic Operations:
		int num1 = 10, num2 = 3;
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
        System.out.println("Addition: " + (num1 + num2));
        System.out.println("Subtraction: " + (num1 - num2));
        System.out.println("Multiplication: " + (num1 * num2));
        System.out.println("Division: " + (num1 / num2));
        System.out.println("Modulus: " + (num1 % num2) + "\n");

		// 4. Demonstrate String (Reference Type):
		String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        System.out.println("String Concatenation: " + fullName);
        System.out.println("Length of fullName: " + fullName.length() + "\n");

        // 5. Show Integer Division vs Decimal Division:
        System.out.println("Integer Division: 10 / 3 = " + (10 / 3));
        System.out.println("Decimal Division (casting): 10 / 3 = " + (10 / 3.0));

		
	

	}

}
