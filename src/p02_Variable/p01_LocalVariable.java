/**
* Author: Shreyas Bhagat
* Date: 20 Jan 2026
* Description: Java Program to show the use of Local Variables
*/
package p02_Variable;
public class p01_LocalVariable {
	public void displayMessage() {
        // Local variable declared inside a method
        	String message = "Hello, I am a local variable!";
        // Accessible only within this method
        	System.out.println(message);

        // Block scope 
        if (true) {
	            int blockVar = 100; // Local variable inside block
	            System.out.println("Block variable value: " + blockVar);
	        }

        // Uncommenting the next line will cause an error
        //System.out.println(blockVar); // blockVar not visible here
    }

    public void calculateSum() {
        int a = 10;  // Local variable
        int b = 20;  // Local variable
        int sum = a + b; // Must be initialized before use
        System.out.println("Sum of local variables: " + sum);
    }

    public static void main(String[] args) {
    	p01_LocalVariable obj = new p01_LocalVariable();
        obj.displayMessage();
        obj.calculateSum();
    }
}
