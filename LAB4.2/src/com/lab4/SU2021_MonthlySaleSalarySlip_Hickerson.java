// File name: SU2021_MonthlySaleSalarySlip_Hickerson.java

package com.lab4;

import java.util.Scanner;

import com.lab4.SaleEmployee_Hickerson;

public class SU2021_MonthlySaleSalarySlip_Hickerson {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);

		// Prompt and receive user inputs, store as variables
		System.out.print("Enter your full name: ");
		String iName = read.nextLine();
		System.out.print("Enter your employee ID: ");
		String iID = read.nextLine();
		System.out.print("Enter the amount of sales: ");
		float iSales = read.nextFloat();
		
		
		// Instantiate new object using overloaded constructor
		SaleEmployee_Hickerson se_H = new SaleEmployee_Hickerson(iName, iID, iSales);
		System.out.println("-------------------------------------------------");
		System.out.println("File: SU2021_MonthlySaleSalarySlip_Hickerson.java");
		System.out.println("SALE COMPANY – Jada Hickerson");
		System.out.println("Today: 06/04/21");
		System.out.println("-------------------------------------------------");
		System.out.print(se_H.toString());
		
		read.close();
	
		
	}

}
