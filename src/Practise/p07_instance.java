/**
* Author: Shreyas Bhagat
* Date: 26 Dec 2025
* Description: 
*/
package Practise;
public class p07_instance {
	
    // ============================================================
    // Q1: Instance Variables vs Static Variables
    // ============================================================
    // Create a "Student" class to understand the difference between
    // instance variables and static variables.
    //
    // Attributes:
    //   - rollNo (int) - Instance variable (unique for each student)
    //   - name (String) - Instance variable (unique for each student)
    //   - marks (double) - Instance variable (unique for each student)
    //   - schoolName (String) - Static variable (same for all students)
    //   - totalStudents (int) - Static variable (count of all students)
    //
    // Constructor:
    //   - Parameterized constructor (rollNo, name, marks)
    //   - Increment totalStudents each time a student is created
    //
    // Methods:
    //   - displayStudentInfo(): Instance method - display student details
    //   - isPassed(): Instance method - return true if marks >= 40
    //   - static displaySchoolInfo(): Static method - display school name 
    //     and total students
    //   - static setSchoolName(String name): Static method - change school name
    //
    // In main():
    //   - Set school name to "Delhi Public School"
    //   - Create 3 students with different details
    //   - Display each student's info and pass/fail status
    //   - Display school info showing total students
    //   - Demonstrate: Each student has DIFFERENT rollNo, name, marks
    //   - Demonstrate: All students share SAME schoolName
    // ============================================================



	public static void main(String[] args) {
	
		 p07_instance_Student.setSchoolName("Delhi Public School");
	     
	        p07_instance_Student s1 = new p07_instance_Student(101, "Alice", 85.5, "Delhi Public School");
	        System.out.println();
	        p07_instance_Student s2 = new p07_instance_Student(102, "Bob", 35.0, "Delhi Public School");
	        System.out.println();
	        p07_instance_Student s3 = new p07_instance_Student(103, "Charlie", 72.3, "Delhi Public School");
	        s1.displayStudentInfo();
	        System.out.println();
	        s2.displayStudentInfo();
	        System.out.println();
	        s3.displayStudentInfo();

	        p07_instance_Student.displaySchoolInfo();
	        

	        System.out.println("  School: " + p07_instance_Student.getSchoolName());
	        System.out.println("  Total Students: " + p07_instance_Student.getTotalStudents());

	        p07_instance_Student.setSchoolName("Modern High School");
	        
	        System.out.println("\nAll students now see the new school:");
	        System.out.println("  s1's school: " + p07_instance_Student.getSchoolName());
	        System.out.println("  s2's school: " + p07_instance_Student.getSchoolName());
	        System.out.println("  s3's school: " + p07_instance_Student.getSchoolName());
		
		
	}
	
}
