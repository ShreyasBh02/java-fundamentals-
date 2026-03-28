/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
 * Description: Demonstrates the use of a while loop
 *              to iterate over an array and print values.
*/
package p07_Loops;
public class p03_WhileLoop {

	public static void main(String[] args) {
		int [] numbers = {10, 20, 30, 40, 50, 60};
	      int index = 0;
	      // Loop until index reaches 5
	      while( index < 5 ) {
	         System.out.print("value of item : " + numbers[index] );
	         index++;
	         System.out.print("\n");
	      }
	}
}
