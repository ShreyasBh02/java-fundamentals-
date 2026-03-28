/**
* Author: Shreyas Bhagat
* Date: 14 Mar 2026
* Description: 
*/
package p05_TypeCasting;
public class p01_TypeCasting {

	public static void main(String[] args) {
		
		 	int intVal = 100;
	        double doubleVal = intVal;
	        System.out.println("Implicit casting (int to double): " + doubleVal);

	        double pi = 3.14159;
	        int truncatedPi = (int) pi; 
	        System.out.println("Explicit casting (double to int): " + truncatedPi);

	        long longVal = 123456789L;
	        float floatVal = (float) longVal;
	        System.out.println("Casting long to float: " + floatVal);
	        char ch = 'A';
	        int ascii = (int) ch;
	        System.out.println("Casting char to int: " + ascii);

	        int num = 66;
	        char letter = (char) num; 
	        System.out.println("Casting int to char: " + letter);


	}

}
