package ArrayPackage;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int phone[] = new int[3];
//	    phone[0] = 7120686;
//	    phone[1] = 7120687;
//	    phone[2] = 7120684;
//	    int count = 1;
//	    for(int i = 0; i < phone.length; ++i) {
//	    	System.out.println("phone number " + count + ": 504" + phone[i]);
//	    	++count;
//	    }
		
		Customer customer[] = new Customer[2];
		Customer customer1 = new Customer("Anil", "Acc12345");
		Customer customer2 = new Customer("Ajay", "Acc12346");
		customer[0] = customer1;
		customer[1] = customer2;
		
		for(int i = 0; i < customer.length; i++) {
			Customer customerObj = customer[i];
			System.out.println("The customer name is: " + customerObj.displayCustomerName());
		}
		
	}
}

class Customer {
	private String name;
	private String customerId;
	
	Customer(String uname, String ucustomerId) {
		name = uname;
		customerId = ucustomerId;
	}
	
	public String displayCustomerName() {
		return name;
	}
	
}
