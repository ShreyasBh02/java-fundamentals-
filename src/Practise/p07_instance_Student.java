/**
 * Author: Shreyas Bhagat
 * Date: 5 Jan 2026
 * Description: 
 */
package Practise;
public class p07_instance_Student {


	public int rollNo;
	public String name;
	public double marks;
	public static String schoolName;
	public static int totalStudents = 0;


	public p07_instance_Student(){
		this.rollNo = 1;
		this.name = "Jhon, Doe";
		this.marks = 75.64;
		schoolName = "St. PerterBurge School";
		totalStudents ++;
		System.out.println("This Default Student data.");
	}

	public p07_instance_Student(int rollNo, String name, double marks, String school){
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
		schoolName = school;
		totalStudents ++;
		System.out.println(this.name+" Students created with Roll no: "+this.rollNo + "under the school "+this.schoolName );
		System.out.println("Total Students in the school "+ this.schoolName +" are: " +this.totalStudents);
	}


	public void displayStudentInfo(){
		System.out.printf("║  Roll No   :      %-22s ║%n", rollNo);
		System.out.printf("║  Student Name  :  %-22s ║%n", name);
		System.out.printf("║  Marks      :  $%-21.2f ║%n", marks);
		System.out.printf("║  School Name :    %-22s ║%n", schoolName);
		System.out.printf("║  Total Students : %-22s ║%n", totalStudents);
	}


	public boolean isPassed(){
		boolean passed= false;
		if(this.marks >=40){
			System.out.println("Students is passed");
			passed= true;
		}
		return passed;
	}

	public static void displaySchoolInfo(){
		System.out.printf("School Name :     " + schoolName);
		System.out.printf("Total Students :  "+ totalStudents);
	}

	public static  void setSchoolName(String name){
		schoolName = name;
		System.out.printf("Upated School Name : " + name);
	}

	public int getRollNo(){
		return rollNo;
	}

	public String getName(){
		return name;
	}

	public double getMarks(){
		return marks;
	}

	public static String getSchoolName(){
		return schoolName;
	}

	public static int getTotalStudents(){
		return totalStudents;
	}


}
