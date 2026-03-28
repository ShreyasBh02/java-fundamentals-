/**
* Author: Shreyas Bhagat
* Date: 26 Mar 2026
* Description: 
*/
package p07_Loops;
public class P09_FibonacciNo {

	public static void main(String[] args) {
        int n = 6;
        int a = 0, b = 1;
        int count = 2;

        while (count <= n) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
        }

        System.out.println("The " + n + "th Fibonacci number is: " + b);
    }

}
