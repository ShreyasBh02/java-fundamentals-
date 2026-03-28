/**
 * Author: Shreyas Bhagat
 * Date: 9 Dec 2025
 * Description: 
 */
package Practise;
public class P03_Methodcalling {

	public void greet() {
		System.out.println("Hello, Welcome to Method Calling in Java!");	
	}
	
	public String getGreetMessage() {
		return "Hello, this is a greeting message from getGreetMessage method.";
	}
	
	public int addNumbers(int a, int b) {
		return a + b;
	}


	public static void main(String[] args) {
		P03_Methodcalling mthd= new P03_Methodcalling();
		mthd.greet();
		String message = mthd.getGreetMessage();
		System.out.println(message);
		int sum = mthd.addNumbers(5, 10);
		System.out.println("Sum: " + sum);
	}

}
