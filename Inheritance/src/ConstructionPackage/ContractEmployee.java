package ConstructionPackage;

public class ContractEmployee extends Employee {
	private double wages;
	private int hours;
	
	double getWages() {
		return wages;
	}
	
	void setWages(double wages) {
		this.wages = wages;
	}
	
	int getHours() {
		return hours;
	}
	
	void setHours(int hours) {
		this.hours = hours;
	}
	
	void calculateSalary() {
		salary = wages * hours;
		System.out.println("Employee Name: " + name + ", " + "Contract Employee Salary: " + salary);
	}
	
}
