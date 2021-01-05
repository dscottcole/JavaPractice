package ThisConstructorPackage;

public class Bank {
	private String bankName;
	private String area;
	private String phoneno;
	
	Bank(String bankName, String area, String phoneno) {
		this.bankName = bankName;
		this.area = area;
		this.phoneno = phoneno;
	}

	void displayBankDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Area of bank: " + area);
		System.out.println("Phone number of bank: " + phoneno);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new Bank("UBank", "Daniel Cole", "8876543210");
		
		bank1.displayBankDetails();
	}

}
