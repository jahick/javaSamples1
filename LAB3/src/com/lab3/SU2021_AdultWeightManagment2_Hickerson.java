package com.lab3;
// File name: SU2021_AdultWeightManagement2_Hickerson

import java.util.Scanner;

public class SU2021_AdultWeightManagment2_Hickerson {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Prompt and receive user inputs, store as variables
		System.out.print("Enter your full name: ");
		String inputName = scanner.nextLine();
		System.out.print("Enter your height in inches: ");
		int inputHeight = scanner.nextInt();
		System.out.print("Enter your expected BMI rate: ");
		float inputExpectedBMI = scanner.nextFloat();

		// Instantiate new object using overloaded constructor
		Adult_Hickerson ah = new Adult_Hickerson(inputName, inputHeight, inputExpectedBMI);
		System.out.println("-------------------------------------------------");
		System.out.println("File: SU2021_AdultWeightManagement2_Hickerson.java");
		System.out.println("Adult Weight Management – Jada Hickerson");
		System.out.println("Standard BMI: 18.5 – 24.9");
		System.out.println("-------------------------------------------------");
		System.out.print(ah);
		scanner.close();

	}

}
