/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
* Description: 
*/
package p07_Loops;
public class p06_ContinueSt {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30, 40, 50};
		for(int  i=0; i<numbers.length; i++) {
			if (numbers[i] == 30) {
				System.out.println("Found 30 at index: " + i);
				break; // Exit the loop when 30 is found
			}
			 System.out.print("value of item : " + numbers[i] );         
	         System.out.print("\n");
			
		}

	}

}
