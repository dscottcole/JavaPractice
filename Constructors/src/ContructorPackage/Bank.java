package ContructorPackage;

public class Bank {
	private String bankName;
	private String area;
	private String phoneno;
	
	Bank() {
		bankName = "Ibank";
		area = "Ghandhi Nagar";
		phoneno = "9876543210";
	}
	
	Bank(String bName, String bArea, String bPhoneno) {
		bankName = bName;
		area = bArea;
		phoneno = bPhoneno;
	}

	void displayBankDetails() {
		System.out.println("Bank Name: " + bankName);
		System.out.println("Area of bank: " + area);
		System.out.println("Phone number of bank: " + phoneno);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bank1 = new Bank();
		Bank bank2 = new Bank("UBank", "Daniel Cole", "8876543210");
		
		bank1.displayBankDetails();
		System.out.println("---------------------------");
		bank2.displayBankDetails();
	}

}
