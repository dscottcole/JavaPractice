package InheritancePackage;

public class Loan {
	int tenure;
	float interestRate;
	
	Loan() {
		System.out.println("Loan class constructor executed.");
	}
	  
	public double calculateEMI(double principal) {
	  double simpleInterest = (principal * interestRate * tenure) / 100;
	  double emi = (simpleInterest + principal) / tenure;
	  return emi;
	}
	
}