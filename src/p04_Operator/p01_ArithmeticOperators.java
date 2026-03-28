/**
* Author: Shreyas Bhagat
* Date: 21 Jan 2026
* Description: Demonstrates basic arithmetic operators in Java
*/
package p04_Operator;
public class p01_ArithmeticOperators {

	public static void main(String[] args) {
		int A = 5, B = 3;
        
        // Addition
        System.out.println("Addition: " + A + " + " + B + " = " + (A + B));
        
        // Subtraction
        System.out.println("Subtraction: " + A + " - " + B + " = " + (A - B));
        
        // Multiplication
        System.out.println("Multiplication: " + A + " * " + B + " = " + (A * B));
        
        // Division (integer division)
        System.out.println("Division: " + A + " / " + B + " = " + (A / B));
        
        // Modulus
        System.out.println("Modulus: " + A + " % " + B + " = " + (A % B));
        
        // Increment (post-increment)
        System.out.println("Increment (post): A = " + A + ", after A++: A = " + (A++));
        A = 5;  // Reset for next demo
        System.out.println("Increment (pre): ++A where A = " + A + ", now A = " + (++A));
        
        // Decrement (post-decrement)
        A = 5;  // Reset
        System.out.println("Decrement (post): A = " + A + ", after A--: A = " + (A--));
        A = 5;  // Reset
        System.out.println("Decrement (pre): --A where A = " + A + ", now A = " + (--A));


	}

}
