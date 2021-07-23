package com.lab3;
// File name: SU2021_SavingMoney_Hickerson

import java.util.Scanner;

public class SU2021_SavingMoney_Hickerson {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);

		// Prompt and receive user inputs, store as variables
		System.out.print("Enter your full name: ");
		String iName = scanner.nextLine();
		System.out.print("Enter your bank account number: ");
		String iAccNum = scanner.nextLine();
		System.out.print("Enter the amount of money in your account: ");
		float iMoney = scanner.nextFloat();
		System.out.print("Enter your interest rate: ");
		float iIntRate = scanner.nextFloat();
		
		// Instantiate new object using overloaded constructor
		Customer_Hickerson bcH = new Customer_Hickerson(iName, iAccNum, iMoney, iIntRate);
		System.out.println("------------------------------------------");
		System.out.println("File: SU2021_SavingMoney_Hickerson.java");
		System.out.println("Saving Money Application – Jada Hickerson");
		System.out.println("------------------------------------------");
		System.out.print(bcH.toString());
		scanner.close();

	}

}

