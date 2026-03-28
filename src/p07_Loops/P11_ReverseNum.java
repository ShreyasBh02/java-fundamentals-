/**
* Author: Shreyas Bhagat
* Date: 26 Mar 2026
* Description: 
*/
package p07_Loops;
public class P11_ReverseNum {

	public static void main(String[] args) {
		int num = 128456;
        int revNum = 0;

        while (num > 0) {
            int rem = num % 10;          
            revNum = revNum * 10 + rem; 
            num = num / 10;           
        }

        System.out.println("Reversed number: " + revNum);

	}

}
