/**
* Author: Shreyas Bhagat
* Date: 23 Dec 2025
* Description: 
*/
package Practise;

import java.time.Year;

public class p06_Employee {
	
	public int empId;
	public String name;
	public String department;
	public double salary;
	public int joiningYear;
	public int currentYear = Year.now().getValue();
	
	public p06_Employee(){
		this.empId = 0;
		this.name = "Not Assigned";
		this.department ="HR";
		this.salary = 200000.0;
		this.joiningYear = 2015;
		System.out.println("This is the default Employee info");
	}
	
	public p06_Employee(int empId, String name){
		this.empId = empId;
		this.name = name;
		this.department ="General";
		this.salary = 30000.0;
		this.joiningYear = 2024;
		System.out.println("Employee "+ name +" created successfully.");
	}
		
	public p06_Employee(int empId, String name, String department,double salary){
		this.empId = empId;
		this.name = name;
		this.department =department;
		this.salary = salary;
		this.joiningYear = currentYear;
		System.out.println("Employee "+ name +" created successfully.");

	}

	public void displayEmployeeInfo(){
		System.out.println("Employee ID: " + this.empId);
		System.out.println("Employee name: "+ this.name);
		System.out.println("Employee department: "+ this.department);
		System.out.println("Employee salary: "+ this.salary);
		System.out.println("Employee joiningYear: "+ this.joiningYear);
	}
	
	public int calculateExperience(){
		if(this.joiningYear == currentYear){
			System.out.println("Employee joined current year: " + currentYear);
			return 0;
		}
		int experience = currentYear - this.joiningYear;
		System.out.println("Employee's Experience: "+ experience);
		return experience;	
	}
	
	public double calculateBonus(){
		double bonus;
		int experience = calculateExperience();
		if(experience > 5){
			bonus =0.1*this.salary;
			this.salary = this.salary + bonus;
			System.out.println("Employee will get the bonus of " + bonus+ " and final salary will be "+this.salary );
			return bonus;
		}
		else{
			bonus =0.05*this.salary;
			this.salary = this.salary + bonus;
			System.out.println("Employee will get the bonus of " + bonus+ " and final salary will be "+this.salary );
			return bonus;
		}	
	}
  public int getEmpId() {
        return empId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getDepartment() {
        return department;
    }
    
    public double getSalary() {
        return salary;
    }
    
    public int getJoiningYear() {
        return joiningYear;
    }

}
