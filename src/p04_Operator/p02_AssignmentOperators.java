/**
* Author: Shreyas Bhagat
* Date: 28 Jan 2026
* Description: 
*/
package p04_Operator;
public class p02_AssignmentOperators {

	public static void main(String[] args) {
		int x;
        int base = 10; 
        System.out.println("=== ARITHMETIC ASSIGNMENTS (Base x = " + base + ") ===");
        // 1. Assignment
	        x = base; 
	        System.out.printf("x = %d \t\t(Initial Value)\n", x);
	        // 2. Addition
	        x = base; x += 3;
	        System.out.printf("x += 3 \t\t-> x = %d\n", x);
	        // 3. Subtraction
	        x = base; x -= 3;
	        System.out.printf("x -= 3 \t\t-> x = %d\n", x);
	        // 4. Multiplication
	        x = base; x *= 3;
	        System.out.printf("x *= 3 \t\t-> x = %d\n", x);
	        // 5. Division
	        x = base; x /= 3;
	        System.out.printf("x /= 3 \t\t-> x = %d  (Integer division drops decimal)\n", x);
	        // 6. Modulus
	        x = base; x %= 3;
	        System.out.printf("x %%= 3 \t\t-> x = %d  (Remainder of 10/3)\n", x);

        System.out.println("\n=== BITWISE ASSIGNMENTS (Base x = 10, Binary 1010) ===");       
	        // 7. Bitwise AND
	        x = 10; x &= 3; // 1010 & 0011
	        System.out.printf("x &= 3 \t\t-> x = %d \t(Binary: %s)\n", x, toBinary(x));
	        // 8. Bitwise OR
	        x = 10; x |= 3; // 1010 | 0011
	        System.out.printf("x |= 3 \t\t-> x = %d \t(Binary: %s)\n", x, toBinary(x));
	        // 9. Bitwise XOR
	        x = 10; x ^= 3; // 1010 ^ 0011
	        System.out.printf("x ^= 3 \t\t-> x = %d \t(Binary: %s)\n", x, toBinary(x));

        System.out.println("\n=== SHIFT ASSIGNMENTS (Base x = 10, Binary 0000 1010) ===");
        // 10. Left Shift
	        x = 10; x <<= 2; // Shift bits left by 2
	        System.out.printf("x <<= 2 \t-> x = %d \t(Binary: %s)\n", x, toBinary(x));
	        // 11. Right Shift
	        x = 10; x >>= 2; // Shift bits right by 2
	        System.out.printf("x >>= 2 \t-> x = %d \t(Binary: %s)\n", x, toBinary(x));      
	        // 12. Unsigned Right Shift (Java Specific)
	        x = -10; x >>>= 1; 
	        System.out.printf("x >>>= 1 \t-> x = %d \t(Unsigned shift on -10)\n", x);
	 
	}

	 public static String toBinary(int num) {
	        return String.format("%4s", Integer.toBinaryString(num)).replace(' ', '0');
	    }
}
