package ConstructionPackage;

public class PermanentEmployee extends Employee{
	
	private double basicPay, hra;
	private int experience;
	
	double getBasicPay() {
		return basicPay;
	}
	
	void setBasicPay(double basicPay) {
		this.basicPay = basicPay;
	}
	
	double getHra() {
		return hra;
	}
	
	void setHra(double hra) {
		this.hra = hra;
	}
	
	int getExperience() {
		return experience;
	}
	
	void setExperience(int experience) {
		this.experience = experience;
	}
	
	void calculateSalary () {
		int variableComponent = 0;
		salary = 0;
		
		if (experience >= 3 && experience < 5) {
			variableComponent = 5;
		} else if (experience >= 5 && experience < 10) {
			variableComponent = 7;
		} else if (experience >= 10) {
			variableComponent = 12;
		}
		
		salary = (variableComponent * 100) + basicPay + hra;
		System.out.println("Employee Name: " + name + ", " + "Permanent Employee Salary: " + salary);
	}

}
