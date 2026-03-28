/**
* Author: Shreyas Bhagat
* Date: 20 Jan 2026
* Description: * This program demonstrates the use of static variables in Java.
 * - Static variables are stored in static memory.
 * - They are created when the program starts and destroyed when it ends.
 * - They can be declared as constants (public/private static final).
 * - Default values are same as instance variables (0, false, null).
 * - Accessed using ClassName.VariableName.
*/
package p02_Variable;
public class p03_StaticVariableDemo {
	// Static variable
    public static int counter; // default value = 0
    // Static constant (never changes)
    public static final String COMPANY_NAME = "Microsoft"; 

    static {
        counter = 100; // initializing static variable
        System.out.println("Static initializer block executed. Counter set to 100.");
    }
    // Constructor increments static variable
    public p03_StaticVariableDemo() {
        counter++;
    }
    // Method to display static variable
    public void showCounter() {
        System.out.println("Counter value: " + counter);
    }

    public static void main(String[] args) {
        // Accessing static constant directly using class name
        System.out.println("Company Name (constant): " + p03_StaticVariableDemo.COMPANY_NAME);

        // Default value demonstration (already initialized in static block)
        System.out.println("Initial Counter value: " + p03_StaticVariableDemo.counter);

        // Creating objects
        p03_StaticVariableDemo obj1 = new p03_StaticVariableDemo();
        obj1.showCounter(); // prints 101
        // Accessing static variable directly without object
        System.out.println("Final Counter value: " + p03_StaticVariableDemo.counter);
    }


}
