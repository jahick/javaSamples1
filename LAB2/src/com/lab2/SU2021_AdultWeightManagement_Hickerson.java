package com.lab2;
// File name: SU2021_AdultWeightManagement_Hickerson.java


import java.util.Scanner;	// import scanner class to allow program to accept user input

public class SU2021_AdultWeightManagement_Hickerson	// public class declaration for program setup

{

	public static void main(String[] args)	// main method declaration for program setup

	{	
		
		Scanner myObj = new Scanner(System.in);	// create scanner object to accept user input
		
		// display prompts for user input and accept user input
		
		System.out.print("Enter your full name: ");	// print prompt for adult’s full name
		String name = myObj.nextLine();		// read name, store as string object

		System.out.print("Enter your height in inches: ");	// print prompt for adult's height
		int height = myObj.nextInt();		// read height, store as int variable

		System.out.print("Enter your expected BMI rate: ");	// print prompt for adult's BMI
		Float bmi = myObj.nextFloat();		// read BMI, store as float variable

		// formula to calculate weight

		float weight = (float) ((bmi * height * height)/703);

		// display inputs and output weight
		
		System.out.println("-------------------------------------------------");
		System.out.println("File: SU2021_AdultWeightManagement_Hickerson.java");
		System.out.println("Adult Weight Management – Jada Hickerson");
		System.out.println("Standard BMI: 18.5 – 24.9");
		System.out.println("-------------------------------------------------");
		System.out.printf("Name: %43s\n", name);
		System.out.printf("Height (inches): %32d\n", height);
		System.out.printf("BMI: %44.1f\n", bmi);
		System.out.println("-------------------------------------------------");
		System.out.printf("Weight (pounds): %32.1f\n", weight);

		// close the scanner object
		myObj.close();
		
	}
}
