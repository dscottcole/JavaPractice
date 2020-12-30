package Bank;
import java.util.Scanner;

public class BalanceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double balance = 0, minbal = 500, depositAmt = 0;
//		Scanner sc = new Scanner(System.in);    
//		do {
//			System.out.println("Enter the amount to be deposited");
//		    depositAmt = sc.nextInt();
//		} while(depositAmt < minbal);
//		balance = depositAmt;
//		System.out.println("Your deposit was successful");

//		double balance = 0, minbal = 500, depositAmt = 0;
//		Scanner sc = new Scanner(System.in);
//		while(depositAmt < minbal) {
//			System.out.println("Enter amount to be deposited");
//		    depositAmt = sc.nextInt();
//		}
//		balance = depositAmt;
//		System.out.println("Your deposit was successful");
		
//		int s = 1;
//		for(int x = 0; x <= 10; x++) {    // initialization with declaration; boolean condition; increment
//			System.out.println(x + " " + s);
//		    s *= 2;
//		}
		
	    double balance = 6000, rateOfInterest = 0.10, interest = 0;
	    double withdrawal = 500, deposit = 600;
	    System.out.println("\nOutput:\n");
	    for(int i = 1; i <= 12; ++i) {
	      balance += deposit;
	      balance -= withdrawal;
	      interest = balance * rateOfInterest;
	      balance += interest;
	      System.out.println("The interest for month " + i + " is " + interest);
	    }
	    System.out.println("The balance at the end of the year is " + balance);
	}
}
