/**
* Author: Shreyas Bhagat
* Date: 21 Jan 2026
* Description: * This program demonstrates the use of non-primitive (reference) data types in Java,
* including String, Array, and custom Class objects.
*/
package p03_DataTypes;

import java.util.Arrays;
class Student {
    // Instance variables (reference type String)
    String name;
    int age;
    // Constructor
    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Method to display student details
    void display() {
        System.out.println("Student Name: " + name + ", Age: " + age);
    }
}

public class p02_NonPrimitiveDataType {
	public static void main(String[] args) {
		// 1. String (reference type)
        String greeting = "Hello, Shreyas!";
        System.out.println("String Example: " + greeting.toUpperCase());

        // 2. Array (reference type)
        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println("Array Example: " + Arrays.toString(numbers));

        // 3. Custom Class Object (reference type)
        Student s1 = new Student("Alice", 22);
        Student s2 = new Student("Bob", 25);
        s1.display();
        s2.display();

        // 4. Wrapper Class (reference type)
        Integer num = Integer.valueOf(100);
        System.out.println("Wrapper Class Example: " + num.toString());
	}

}
