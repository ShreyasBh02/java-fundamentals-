/**
 * Author: Shreyas Bhagat
 * Date: 14 Mar 2026
 * Description: Demonstrates the use of if-else-if statements
 *              to assign grades based on score ranges.
 */

package p06_CondtionalSt;
public class p03_IfElseIf {

	public static void main(String[] args) {
		int score = 85;

		if (score >= 90) {
		    System.out.println("Grade: A");
		} else if (score >= 80) {
		    System.out.println("Grade: B");
		} else if (score >= 70) {
		    System.out.println("Grade: C");
		} else {
		    System.out.println("Grade: F");
		}
		

	}

}
