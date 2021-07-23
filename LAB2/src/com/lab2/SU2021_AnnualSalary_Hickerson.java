package com.lab2;
// File name: SU2021_AnnualSalary_Hickerson.java


// import scanner class to allow program to accept user input
import java.util.Scanner;	

// public class declaration for program setup
public class SU2021_AnnualSalary_Hickerson	

{

	public static void main(String args[])	// main method declaration for program setup

	{	
		
		Scanner myObj = new Scanner(System.in);	// create scanner object to accept user input
		
		// display prompts for user input and accept user input
		
		System.out.print("Enter your full name: ");	// print prompt for employee’s full name
		String name = myObj.nextLine();		// read employee name, store as string object

		System.out.print("Enter your hourly salary: ");	// print prompt for employee’s hourly salary
		Float hourlySalary = myObj.nextFloat();	// read salary, store as float variable

		System.out.print("Enter your weekly hours: ");	// print prompt for employee’s weekly hours
		int weeklyHours = myObj.nextInt();		// read weekly hours, store as int variable

		// yearly salary calculation -- 52 * weekly hours = yearly hours --> yearly hours * hourly salary = yearly salary

		float yearlySalary = (float) (hourlySalary * weeklyHours * 52);

		// display inputs and output yearly salary
		
		System.out.println("------------------------------------------------------");
		System.out.println("File: SU2021_AnnualSalary_Hickerson.java");
		System.out.println("Annual Salary Application – Jada Hickerson");
		System.out.println("------------------------------------------------------");
		System.out.printf("Name of employee: %36s\n", name);
		System.out.printf("Hourly salary: %39.1f\n", hourlySalary);
		System.out.printf("Number of working hours in each week: %16d\n", weeklyHours);
		System.out.println("------------------------------------------------------");
		System.out.printf("Yearly salary is: %36.1f\n", yearlySalary);

		// close the Scanner object
		myObj.close();
		
	}
}
