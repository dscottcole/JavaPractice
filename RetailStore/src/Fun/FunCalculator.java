package Fun;
import java.util.Scanner;

public class FunCalculator {
	
	public void calcArmstrong() {
		System.out.println("Provide me with a number to check for \"Armstrong-ness\".");
		Scanner arm = new Scanner(System.in);
		int number = arm.nextInt();
		
		boolean check = false;
		int sum = 0;
		int num = number;
		
		while (num != 0) {
			sum += Math.pow((num % 10),3);
			num = num / 10;
		}
		
		if (sum == number) {
			check = true;
		}
		
		if (check == true) {
			System.out.println("Your number " + number + " is an Armstrong number");
		} else {
			System.out.println("Your number " + number + " is NOT an Armstrong number");
		}
		
	}
	
	public void calcLucky() {
//		System.out.println("Still under development.");
		System.out.println("Provide me with a number to check for \"Luckiness\".");
		Scanner luck = new Scanner(System.in);
		int number = luck.nextInt();
		
		boolean check = false;
		int sum = 0;
		int num = number;
		int i = String.valueOf(number).length() % 2 == 0? 2 : 1;
		if (String.valueOf(number).length() > 1) {
			while (num != 0) {
				if (i % 2 == 0) {
					sum += Math.pow((num % 10), 2);
					num = num / 10;
					i++;
				} else {
					num = num / 10;
					i++;
				}

			}
			
			if (sum % 9 == 0) {
				check = true;
			}
			
			if (check == true) {
				System.out.println("Your number " + number + " is a lucky number!");
			} else {
				System.out.println("Your number " + number + " is NOT a lucky number");
			}
		} else {
			System.out.println("Please provide me a number with more than one digit.");
			calcLucky();
		}
		
	}
	
	public void getChoice () {
		
		Scanner scn = new Scanner(System.in);
		int choice = 0;
		do {
			System.out.println("1. Calculate Armstrong");
			System.out.println("2. Calculate Lucky Number");
			choice = scn.nextInt();
			System.out.println("Your choice is " + choice);
			
			if (choice == 1) {
				calcArmstrong();
			} else if (choice == 2) {
				calcLucky();
			} else {
				System.out.println("Oops! Invalid choice!");
			}
			
		} while(choice != 1 || choice != 2);

	}

	public static void main(String[] args) {
		FunCalculator numbers = new FunCalculator();
		numbers.getChoice();
	}
}
