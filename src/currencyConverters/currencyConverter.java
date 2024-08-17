package currencyConverters;

import java.util.Scanner;

public class currencyConverter {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Choose A Conversion Option:");
		System.out.println("1.Dollars to Euros");
		System.out.println("2.Euros to Dollars");
		System.out.println("3.Dollars to Yen");
		System.out.println("4.Yen to Dollars");
		System.out.println("5.Dollars to Yen");
		System.out.println("6.Dollars to UK Pounds");
		System.out.println("7.UK Pounds to Dollars");
		System.out.println("8.Sweden Kronor to Dollars");
		System.out.println("9.Dollars to Russian Rubles");
		System.out.println("10.Russian Rubles to Dollars");

		int Choice = sc.nextInt();

		System.out.println("Enter the Amount to Convert:");
		double amount = sc.nextDouble();

		double convertedAmount = 0;

		switch (Choice) {

		case 1:
			convertedAmount = amount * 0.678518116;
			System.out.println(amount + " Dollars is equal to" + convertedAmount + " Euros");
			break;

		case 2:
			convertedAmount = amount * 1.4738;
			System.out.println(amount + " Euros is equal to" + convertedAmount + " Dollars");
			break;

		case 3:
			convertedAmount = amount * 95.71255;
			System.out.println(amount + "  Dollars is equal to " + convertedAmount + " Yen");
			break;

		case 4:
			convertedAmount = amount / 95.71255;
			System.out.println(amount + " Yen is equal to " + convertedAmount + " Dollars");
			break;

		case 5:
			convertedAmount = amount * 0.773;
			System.out.println(amount + " Dollars is equal " + convertedAmount + " UK Pounds ");
			break;

		case 6:
			convertedAmount = amount / 0.773;
			System.out.println(amount + " UK Pounds is equal to " + convertedAmount + " Dollars");
			break;

		case 7:
			convertedAmount = amount * 8.532;
			System.out.println(amount + " Sweden Kronor is equal to " + convertedAmount + "Dollars");
			break;

		case 8:
			convertedAmount = amount / 8.532;
			System.out.println(amount + " Dollars is equal to " + convertedAmount + "Sweden Kronor");
			break;

		case 9:
			convertedAmount = amount * 60.5;
			System.out.println(amount + " Dollars is equal to " + convertedAmount + "Russian Rubles");
			break;

		case 10:
			convertedAmount = amount / 60.5;
			System.out.println(amount + " Russian Rubles is equal to " + convertedAmount + " Dollars");
			break;

		default:
			System.out.println("Invalid choice!!. \nPlease choose a valid option.");
		}

	}

}
