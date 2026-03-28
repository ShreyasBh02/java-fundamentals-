/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
 * Description: Demonstrates the use of a Do while loop
 *              to iterate over an array and print values.
*/
package p07_Loops;
public class p04_DoWhileLoop {

	public static void main(String[] args) {
		 int [] numbers = {10, 20, 30, 40, 50};
	      int index = 0;

	      do {
	         System.out.print("value of item : " + numbers[index] );
	         index++;
	         System.out.print("\n");
	      } while( index < 5 );
	}
}
