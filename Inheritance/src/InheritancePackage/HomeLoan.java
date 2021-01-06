package InheritancePackage;

public class HomeLoan extends Loan {
	
	HomeLoan() {
		tenure = 5;
		interestRate = 8.5f;
		System.out.println("HomeLoan class constructor executed.");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    HomeLoan hloan = new HomeLoan();
	    double amount = hloan.calculateEMI(200000);
	    System.out.println("HomeLoan emi per year: " + amount);
	}

}
