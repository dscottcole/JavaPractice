package Reverse;

public class ReverseCalculator {
	
	public int input;
	
	public void setInput(int x) {
		input = x;
		System.out.println("Input set to: " + input);
	}
	
	public void getRevWhile() {
		int forward = input;
		int reverse = 0;
		
		while (forward != 0) {
			int builder = forward % 10;
			reverse = reverse * 10 + builder;
			forward /= 10;
		}
		System.out.println("While, Reversed Number: " + reverse);
	}
	
	public void getRevFor() {
		int forward = input;
		int reverse = 0;
		
		for (int i = 0; i < String.valueOf(input).length(); i++) {
			int builder = forward % 10;
			reverse = reverse * 10 + builder;
			forward /= 10;
		}
		System.out.println("For, Reversed Number: " + reverse);
	}
	
	public void getRevDoWhile() {
		int forward = input;
		int reverse = 0;
		int i = 0;
		
		do {
			int builder = forward % 10;
			reverse = reverse * 10 + builder;
			forward /= 10;
			i++;
			
		} while (i < String.valueOf(input).length());
		System.out.println("Do-While, Reversed Number: " + reverse);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseCalculator rev = new ReverseCalculator();
		rev.setInput(923456781);
		rev.getRevWhile();
		rev.getRevFor();
		rev.getRevDoWhile();
	}

}
