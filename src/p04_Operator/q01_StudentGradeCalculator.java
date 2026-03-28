/**
* Author: Shreyas Bhagat
* Date: 29 Jan 2026
* Description: 
## PROBLEM 1 : BASIC LEVEL – STUDENT GRADE CALCULATOR

Problem Title:
Simple Student Performance Evaluator

Scenario:
Create a Java program that evaluates a student’s academic performance.
The program calculates the average score, assigns a grade, determines
pass or fail status, and displays a performance message.
This problem focuses on basic arithmetic, relational, logical,
and conditional operators.

Input Required:

	* Student Name
	* Test Score 1 (out of 100)
	* Test Score 2 (out of 100)
	* Test Score 3 (out of 100)
	* Attendance Percentage
	* Assignment Submitted (true / false)

Processing Logic:

	* Calculate average of three test scores
	* Assign grade based on average:
	
	  * A : 90 and above
	  * B : 75 to 89
	  * C : 60 to 74
	  * D : 40 to 59
	  * F : Below 40
	* Decide pass or fail based on grade and attendance
	* Generate a suitable performance message

Output Required:

	* Average Score
	* Final Grade
	* Pass / Fail Status
	* Performance Feedback Message
*/
package p04_Operator;
public class q01_StudentGradeCalculator {

	public static void main(String[] args) {
		String studentName="John Doe";
		double testScore1 = 59.5;
		double testScore2 = 91;
		double testScore3 = 40.5;
		int attendancePercentage =76;
		boolean assignmentSubmitted = false;
		
		System.out.println("Student Name: " + studentName);
		
		double[]results = calculateAverageofTest(testScore1,testScore2,testScore3);
		double average = results[0];
		double percentage = results[1];

		
		char grade = assignGrade(average);
		System.out.printf("Grade: %c\n", grade);
		
		boolean passed = (average >= 60) && (attendancePercentage >= 75) && assignmentSubmitted;
		boolean failed = !passed;
		boolean allSubjectsPassed = (testScore1 >= 40) && (testScore2 >= 40) && (testScore3 >= 40);
		boolean finalResult = passed && allSubjectsPassed;
		String status = (finalResult) ? "PASSED" : "FAILED";
		System.out.printf("Status: %s\n", status);
		
		
		String performance = (average >= 90) ? "Outstanding" :
                     (average >= 80) ? "Excellent" :
                     (average >= 70) ? "Good" :
                     (average >= 60) ? "Satisfactory" : "Needs Improvement";

		
		String feedback = (finalResult) ? 
						  ((average >= 85) ? "Congratulations! Keep it up!" : "Good job! Aim higher!") :
						  ((attendancePercentage < 75) ? "Failed due to low attendance" : "Failed. Work harder!");
						  
	int bonusPoints = 0;
	if (average >= 90) bonusPoints += 10;
	if (attendancePercentage >= 95) bonusPoints += 5;
	if (assignmentSubmitted) bonusPoints++;

	double finalScore = percentage + bonusPoints;
	System.out.printf("Final Score: %.2f%%\n", finalScore);
						  
		System.out.printf("Final Score: %.2f%%\n", finalScore);


	}
	
	public static double[]calculateAverageofTest(double Score1, double Score2, double Score3){
		double totalMarks = (Score1+ Score2+ Score3);
		
		double average = totalMarks / 3.0;
		System.out.printf("Average: %.2f%%\n", average);

		double percentage = (totalMarks / 300.0) * 100;
		System.out.printf("Percentage: %.2f%%\n", percentage);
		
		return new double[]{average, percentage};
	}
		 
	public static char assignGrade(double average){
		char grade;
		if (average >= 90) {
			grade = 'A';
		} else if (average >= 80) {
			grade = 'B';
		} else if (average >= 70) {
			grade = 'C';
		} else if (average >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		  return grade;
	}
	
	

}
