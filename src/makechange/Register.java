package makechange;

public class Register {

	public static void main(String[] args) {

		java.util.Scanner keyboard = new java.util.Scanner(System.in);
		System.out.println("What is the price of the item?: ");
		double price = keyboard.nextDouble();

		System.out.println("How much did customer give?: ");
		double give = keyboard.nextDouble();
		keyboard.close();

		double round;
		double change = (double) give - price;
		int twentys = 0;
		int tens = 0;
		int fives = 0;
		int ones = 0;
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennys = 0;

		if (price > give) {
			System.out.println("This is not enough money. Please give correct amount. ");
		}
		if (give > price) {

			System.out.printf("Thank you. Your change is: $ %.2f\n", change);

			if (change / 20 > 0) {
				twentys = (int) change / 20;
				change = change % 20;
				System.out.println("Twentys: " + twentys);
			}
			if (change / 10 > 0) {
				tens = (int) change / 10;
				change = change % 10;
				System.out.println("Tens: " + tens);
			}
			if (change / 5 > 0) {
				fives = (int) change / 5;
				change = change % 5;
				System.out.println("Fives: " + fives);
			}
			if (change / 1 > 0) {
				ones = (int) change / 1;
				change = change % 1;
				System.out.println("Ones: " + ones);
			}
			if (change / 0.25 > 0) {
				quarters = (int) (change / 0.25);
				change = change % 0.25;
				System.out.println("Quarters: " + quarters);
			}
			if (change / 0.10 > 0) {
				dimes = (int) (change / 0.10);
				change = change % 0.10;
				System.out.println("Dimes: " + dimes);
			}	
			if (change/0.05 > 0) {
				nickels = (int) (change/0.05);
				change= change % 0.05;
				System.out.println("Nickels: " + nickels);
			}
			if(change/0.01 > 0) {
				pennys = (int) (change/0.01);
				change= change % 0.01; 
				System.out.println("Pennies: " + pennys);
			}	
				
				
				
				
			}
		}

	}

