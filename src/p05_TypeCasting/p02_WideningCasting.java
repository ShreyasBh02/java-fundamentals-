/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
* Description: 
*/
package p05_TypeCasting;
public class p02_WideningCasting {

	public static void main(String[] args) {
		   System.out.println("=== WIDENING (AUTOMATIC) CASTING ===");
		   int myInt=9;
		   double myDouble=myInt;
		   long myLong = myInt; 
		   float myFloat = myInt;
		    System.out.println("Original int value:   " + myInt);
	        System.out.println("Widened to long:      " + myLong);
	        System.out.println("Widened to float:     " + myFloat); 
	        System.out.println("Widened to double:    " + myDouble);
	        
	        System.out.println("\nCalculation Check:");
	        System.out.println("int (100) + double (1.5) = " + (myInt + 1.5)); 
		
	}

}
