package com.lab5_2;

import java.util.Scanner;

public class SU2021_MortgageService_Hickerson {

	static Scanner read = new Scanner(System.in);

	public static String dash = "---------------------------------------------- \n";

	public static String file = "File: SU2021_MortgageService_Hickerson.java \n";

	public static void print(Object arg0) {
		System.out.println(arg0);
	}

	/**
	 * Calculates monthly payment 
	 * 
	 * @param	PRNCPL	 the principal amount
	 * @param 	NOP	 number of payments
	 * @param	IR	 interest rate
	 * @return	the monthly payment
	 */
	
	public static float getMonthlyPayment(float PRNCPL, int NOP, float IR) {

		float monthlyPayment = (float) ((PRNCPL * Math.pow(1 + IR / 100 / 12, NOP) * IR / 100 / 12)
				/ (Math.pow(1 + IR / 100 / 12, NOP) - 1));
		return monthlyPayment;
	}

	/**
	 * Displays user's options and accepts user input
	 * @return	the user's selection
	 */
	
	public static MenuItem menu() {
		String display = file + "MENU OF MORTGAGE SERVICE – Jada Hickerson \n" + dash
				+ "1. Calculate the Mortgage Monthly Payment \n" + "2. Open Mortgage Account \n"
				+ "3. Check Interest Rate of current Mortgage Account \n"
				+ "4. Check Current Principal of current Mortgage Account \n" + "5. Process Monthly Payment \n"
				+ "0. Exit \n" + "\nEnter the task you would like to complete: ";

		print(display);
		int input = read.nextInt();
		MenuItem choice = MenuItem.values()[input];
		read.nextLine();
		return choice;
	}

	public static void main(String[] args) {

		MenuItem task = MenuItem.Noop;

		String fn;
		String ln;
		float prncpl;
		int nop;
		float ir;
		String name;

		MortgageAccount_Hickerson currentAccount = null;

		while (task != MenuItem.Terminate) {

			task = menu();

			switch (task) {

			case CalculateMortgageMonthlyPayment :		// option 1 selected

				print("Enter your first name: ");
				fn = read.nextLine();
				print("Enter your last name: ");
				ln = read.nextLine();
				name = ln + ", " + fn;
				print("Enter your principal amount: ");
				prncpl = read.nextFloat();
				print("Enter your interest rate: ");
				ir = read.nextFloat();
				print("Enter your number of payments: ");
				nop = read.nextInt();
				read.nextLine();

				print("");

				String opt1Str = file + "ESTIMATE MONTHLY PAYMENT - Jada Hickerson \n" + dash
						+ String.format("Name: %40s\n", name) + String.format("Principal: %35.3f\n", prncpl)
						+ String.format("Number of payments: %26d\n", nop)
						+ String.format("Interest rate: %30.3f%%\n", ir) + dash
						+ String.format("Monthly payment: %29.3f\n", getMonthlyPayment(prncpl, nop, ir));

				print(opt1Str);
				

				break;

			case OpenMortgageAccount:		// option 2 selected

				print("Enter your first name: ");
				fn = read.nextLine();
				print("Enter your last name: ");
				ln = read.nextLine();
				name = ln + ", " + fn;
				print("Enter your principal amount: ");
				prncpl = read.nextFloat();
				print("Enter your interest rate: ");
				ir = read.nextFloat();
				print("Enter your number of payments: ");
				nop = read.nextInt();
				read.nextLine();

				currentAccount = new MortgageAccount_Hickerson(fn, ln, prncpl, ir, nop);
				print(currentAccount.openNewAccount(getMonthlyPayment(prncpl, nop, ir)));
				//read.nextLine();

				break;

			case CheckInterestRate:		// option 3 selected

				if (currentAccount == null)
					print("The account was not created, cannot check interest rate. \n");
				else
					print(currentAccount.checkInterestRate());

				break;

			case CheckCurrentPrincipal:		// option 4 selected

				if (currentAccount == null)
					print("The account was not created, cannot check principal. \n");
				else
					print(currentAccount.checkCurrentPrincipal());

				break;

			case ProcessPayment:		// option 5 selected

				if (currentAccount == null)
					print("The account was not created, cannot process monthly payment. \n");

				else {
					print("Enter your payment amount: ");
					float paymentAmount = read.nextFloat();
					read.nextLine();
					float monthlyPayment = getMonthlyPayment(currentAccount.principal, currentAccount.numOfPayments,
							currentAccount.interestRate);

					print(currentAccount.processPayment(monthlyPayment, paymentAmount));
					//0read.nextLine();
				}
				break;
				
			case Terminate:		// option 0 selected, program terminates
				
				break;
				
			default:
				
				print("Invalid input. Select an option from the menu");
				
			}

		}

		print("Program ended.");
		read.close();

	}

}
