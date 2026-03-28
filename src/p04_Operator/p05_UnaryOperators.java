/**
* Author: Shreyas Bhagat
* Date: 28 Jan 2026
* Description: 
*/
package p04_Operator;
public class p05_UnaryOperators {

	public static void main(String[] args) {
		System.out.println("=== 1. UNARY PLUS & MINUS ===");
        int num = 5;
        
        int resultPlus = +num; 
        int resultMinus = -num; 
        
        System.out.println("Original: " + num);
        System.out.println("Unary Plus (+): " + resultPlus);
        System.out.println("Unary Minus (-): " + resultMinus);
        
        int negativeNum = -10;
        System.out.println("Negating a negative (-(-10)): " + (-negativeNum));
        System.out.println("\n=== 2. INCREMENT (The 'Pre' vs 'Post') ===");
        // --- POST-INCREMENT (x++) ---
        int a = 5;
        int b = a++; 
        // 1. Assign 'a' (5) to 'b'.
        // 2. Increment 'a' to 6.
        System.out.println("POST-Increment (b = a++):");
        System.out.println("  Value of b (assigned first): " + b); 
        System.out.println("  Value of a (updated later):  " + a);
        System.out.println(); // Empty line

        // --- PRE-INCREMENT (++x) ---
        int x = 5;
        int y = ++x;
        // 1. Increment 'x' to 6 immediately.
        // 2. Assign the new 'x' (6) to 'y'.
        System.out.println("PRE-Increment (y = ++x):");
        System.out.println("  Value of y (updated first):  " + y);
        System.out.println("  Value of x (updated first):  " + x);

        System.out.println("\n=== 3. DECREMENT ===");
        
        // --- POST-DECREMENT (x--) ---
        int m = 5;
        int n = m--;
        System.out.println("POST-Decrement (n = m--):");
        System.out.println("  n gets old value: " + n); // 5
        System.out.println("  m becomes:        " + m); // 4

        System.out.println();
        // --- PRE-DECREMENT (--x) ---
        int p = 5;
        int q = --p;
        System.out.println("PRE-Decrement (q = --p):");
        System.out.println("  q gets new value: " + q); // 4
        System.out.println("  p becomes:        " + p); // 4
   
        System.out.println("\n=== 4. COMPLEX EXAMPLE ===");
        int i = 10;
        // i++ uses 10, then i becomes 11.
        // ++i increments 11 to 12, then uses 12.
        // Result = 10 + 12 = 22.
        int total = (i++) + (++i); 
        
        System.out.println("i starts at 10.");
        System.out.println("Calculation: (i++) + (++i)");
        System.out.println("Total Result: " + total);

	}

}
