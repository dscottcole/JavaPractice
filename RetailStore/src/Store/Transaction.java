package Store;

public class Transaction {
	public int billId;
	public int customerId;
	public int discount;
	public double billAmount;
	public double discountedBillAmount;
	
	public void calcDiscount () {
		discountedBillAmount = (double)((int)((billAmount - billAmount * ((double)discount/100)) * 100))/100;
		
		System.out.println("Discounted Bill: " + discountedBillAmount);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transaction trans = new Transaction();
		trans.billId = 1001;
		trans.customerId = 101;
		trans.discount = 2;
		trans.billAmount = 199.99;
		trans.calcDiscount();
		Transaction trans2 = new Transaction();
		trans2.billId = 1002;
		trans2.customerId = 102;
		trans2.discount = 4;
		trans2.billAmount = 210.5;
		trans2.calcDiscount();

	}

}
