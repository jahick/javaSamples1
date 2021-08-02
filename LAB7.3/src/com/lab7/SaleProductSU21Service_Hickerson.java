package com.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaleProductSU21Service_Hickerson {

	static String stringDate;
	static Scanner read = new Scanner(System.in);
	public static String dash = "------------------------------------------------------ \n";
	public static String FILE = "File: SaleProductSU21Service_Hickerson.java \n";

	// custom print function
	public static void print(Object arg0) {
		System.out.println(arg0);
	}
	
	public static String printMonthlySaleReport(PRODUCTSU21_Hickerson a, PRODUCTSU21_Hickerson b) {
		float subtotal = a.getMoney() + b.getMoney();
		float taxAmount = subtotal * .0825f;
		float total = subtotal + taxAmount;
		String dateString = stringDate.substring(0, 2) +"/"+stringDate.substring(2, 6);
		String space = "                              ";
		String receipt_str = FILE + "Sale SU21Product Month Report -- Jada Hickerson \n" 
		+ "Day:" + space + dateString
				 +"\n" + dash 
				 + a.toString() 
				 + b.toString() 
				 + dash
				+ String.format("Subtotal: %32.2f \n", subtotal)
				+ String.format("Tax: %37.2f \n", taxAmount)
				+ String.format("Total: %35.2f \n", total) ;
		

		return receipt_str;
	}
	
	public static void main(String[] args) {
		Scanner file = null;
		
		while (file == null) {
			try {
				print("Enter a date in the format of MMYYYY");
				stringDate = read.nextLine();
				file = new Scanner(new File("monthFile_"+stringDate + ".txt"));
				int numOfAUnits = 0;
				int numOfBUnits = 0;
				while(file.hasNextLine()) {
					String line = file.nextLine();
					String[] parts = line.split(" ");
					int a = Integer.parseInt(parts[1]);
					int b = Integer.parseInt(parts[2]);
					numOfAUnits += a;
					numOfBUnits += b;
				}
				
				PRODUCTSU21_Hickerson productA = new PRODUCTSU21_Hickerson('A', numOfAUnits, 219.99f);
				PRODUCTSU21_Hickerson productB = new PRODUCTSU21_Hickerson('B', numOfBUnits, 350.99f);
				print(printMonthlySaleReport(productA, productB));
			}
			catch(FileNotFoundException e) {
				print("File does not exist");
			}
		}

	}

}
