/**
* Author: Shreyas Bhagat
* Date: 20 Jan 2026
* Description:This example demonstrates the use of instance variables, which are declared within a class and initialized via a constructor, with default values for uninitialized primitive types. 
*/
package p02_Variable;
public class p02_InstanceVariable {
	// Instance variables
	private String name;
	private int age;
	private boolean isStudent;
	
	// Default Constructor
	public p02_InstanceVariable() {
		this.name = "Jhon Doe"; 		// Default value
		this.age = 18; 					// Default value
		this.isStudent = false; 		// Default value
	}
	
	// Parameterized Constructor
	public p02_InstanceVariable(String name, int age, boolean isStudent) {
		this.name = name; 
		this.age = age;
		this.isStudent = isStudent;
	}
	// Method to display instance variable values
	 public void displayValues() {
		 	System.out.println("Name: " + name);
	        System.out.println("Age (int): " + age);
	        System.out.println("Is Student (boolean): " + isStudent);
	        System.out.println("-----------------------------");
	    }

	public static void main(String[] args) {
		// Object created using default constructor
		p02_InstanceVariable obj1 = new p02_InstanceVariable();
        obj1.displayValues();			//ObjectReference.VariableName

        // Object created using parameterized constructor
        p02_InstanceVariable obj2 = new p02_InstanceVariable("Alice", 25, true);
        obj2.displayValues();			//ObjectReference.VariableName


	}

}
