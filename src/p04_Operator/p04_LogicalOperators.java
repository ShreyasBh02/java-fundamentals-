/**
* Author: Shreyas Bhagat
* Date: 28 Jan 2026
* Description: 
*/
package p04_Operator;
public class p04_LogicalOperators {

	public static void main(String[] args) {
		 boolean a = true;
	        boolean b = false;

	        System.out.println("a = " + a);
	        System.out.println("b = " + b);

	        // AND (&&) - Needs both to be true
	        System.out.println("a && b : " + (a && b)); // false

	        // OR (||) - Needs one to be true
	        System.out.println("a || b : " + (a || b)); // true

	        // NOT (!) - Reverses the result
	        System.out.println("!a     : " + (!a));     // false
	        System.out.println("!(a && b): " + !(a && b)); // true (NOT false becomes true)

	}

}
