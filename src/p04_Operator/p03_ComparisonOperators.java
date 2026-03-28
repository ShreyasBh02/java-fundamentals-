/**
* Author: Shreyas Bhagat
* Date: 28 Jan 2026
* Description: 
*/
package p04_Operator;
public class p03_ComparisonOperators {

	public static void main(String[] args) {
        // Setup variables
        int a = 10;
        int b = 20;
        int c = 10; // We need a third number to test >= and <= properly

        System.out.println("=== DATA VALUES ===");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        System.out.println("\n=== 1. BASIC COMPARISONS (True/False) ===");
        
        // == (Equal to)
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a == c : " + (a == c)); // true

        // != (Not Equal to)
        System.out.println("a != b : " + (a != b)); // true

        // > (Greater Than)
        System.out.println("a > b  : " + (a > b));  // false (10 is not bigger than 20)
        
        // < (Less Than)
        System.out.println("a < b  : " + (a < b));  // true (10 is smaller than 20)

        // >= (Greater OR Equal)
        // This is true if a is bigger than c OR if a is equal to c
        System.out.println("a >= c : " + (a >= c)); // true (because they are equal)

        // <= (Less OR Equal)
        System.out.println("b <= a : " + (b <= a)); // false (20 is not small or equal to 10)


	}

}
