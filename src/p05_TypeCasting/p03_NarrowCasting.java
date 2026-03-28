/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
* Description: 
*/
package p05_TypeCasting;
public class p03_NarrowCasting {
	public static void main(String args[]) {
		double myDouble = 9.78;
		int myInt = (int) myDouble; 

		System.out.println("Double value: " + myDouble); // Outputs 9.78
        System.out.println("Integer value after casting: " + myInt); // Outputs 9

	}

}
