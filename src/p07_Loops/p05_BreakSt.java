/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
* Description: 
*/
package p07_Loops;
public class p05_BreakSt {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		for(int  i=0; i<numbers.length; i++) {
			if (numbers[i] == 30) {
				System.out.println("Found 30 at index: " + i);
				continue; // Skip the rest of the loop body and move to the next iteration
			}
			 System.out.print("value of item : " + numbers[i] );         
	         System.out.print("\n");
			
		}

	}

}
