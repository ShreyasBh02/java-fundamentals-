/**
 * Author: Shreyas Bhagat
 * Date: 26 Mar 2026
 * Description: Count the occurrence of a digit in a number.
 */
package p07_Loops;
public class p10_CountingOccuranceofNo {


	public static void main(String[] args) {
		int number = 43464684;
		int digitToCount = 0;
		int count = 0;

		int temp = number;
		while (temp > 0) {
			int rem = temp % 10;
			if (rem == digitToCount) {
				count++;
			}
			temp = temp / 10;
		}

		System.out.println("Digit " + digitToCount + " occurs " + count + " times in " + number);
	}


}
