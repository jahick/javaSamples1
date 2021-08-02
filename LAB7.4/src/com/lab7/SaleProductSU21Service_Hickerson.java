package com.lab7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SaleProductSU21Service_Hickerson {

	static String stringDate1;
	static String stringDate2;
	static Scanner read = new Scanner(System.in);
	public static String dash = "------------------------------------------------------ \n";
	public static String FILE = "File: SaleProductSU21Service_Hickerson.java \n";

	// custom print function
	public static void print(Object arg0) {
		System.out.println(arg0);
	}

	public static String printCompareMonthlySaleReport(PRODUCTSU21_Hickerson a, PRODUCTSU21_Hickerson b,
			PRODUCTSU21_Hickerson a2, PRODUCTSU21_Hickerson b2) {

		int aDiff = a2.getUnits() - a.getUnits();
		int bDiff = b2.getUnits() - b.getUnits();

		float aStatus = 100f * aDiff / a.getUnits();
		float bStatus = 100f * bDiff / b.getUnits();
		String dateString1 = stringDate1.substring(0, 2) + "/" + stringDate1.substring(2, 6);
		String dateString2 = stringDate2.substring(0, 2) + "/" + stringDate2.substring(2, 6);
		String space = "                              ";
		String receipt_str = FILE + "SU21Product Compare Months Report - Jada Hickerson \n" 
				+ String.format("%-15s %7s %7s %7s %%%6s\n","Months", dateString1,dateString2,"Different","Status")
				+ dash
				+ String.format("SU21Product%1c %7d %7d %7d %10.2f%%\n", Character.toUpperCase(a.model), a.getUnits(),
						a2.getUnits(), aDiff, aStatus)
				+ String.format("SU21Product%1c %7d %7d %7d %10.2f%%\n", Character.toUpperCase(b.model), b.getUnits(),
						b2.getUnits(), bDiff, bStatus);

		return receipt_str;
	}

	public static void main(String[] args) {
		Scanner file1 = null;
		Scanner file2 = null;
		while (file1 == null || file2 == null) {
			try {
				print("Enter a date for first month in the format of MMYYYY");
				stringDate1 = read.nextLine();
				file1 = new Scanner(new File("monthFile_" + stringDate1 + ".txt"));
				print("Enter a date for second month in the format of MMYYYY");
				stringDate2 = read.nextLine();
				file2 = new Scanner(new File("monthFile_" + stringDate2 + ".txt"));

				int numOfAUnits1 = 0;
				int numOfBUnits1 = 0;
				while (file1.hasNextLine()) {
					String line = file1.nextLine();
					String[] parts = line.split(" ");
					int a = Integer.parseInt(parts[1]);
					int b = Integer.parseInt(parts[2]);
					numOfAUnits1 += a;
					numOfBUnits1 += b;
				}

				int numOfAUnits2 = 0;
				int numOfBUnits2 = 0;
				while (file2.hasNextLine()) {
					String line = file2.nextLine();
					String[] parts = line.split(" ");
					int a = Integer.parseInt(parts[1]);
					int b = Integer.parseInt(parts[2]);
					numOfAUnits2 += a;
					numOfBUnits2 += b;
				}

				PRODUCTSU21_Hickerson productA1 = new PRODUCTSU21_Hickerson('A', numOfAUnits1, 219.99f);
				PRODUCTSU21_Hickerson productB1 = new PRODUCTSU21_Hickerson('B', numOfBUnits1, 350.99f);
				PRODUCTSU21_Hickerson productA2 = new PRODUCTSU21_Hickerson('A', numOfAUnits2, 219.99f);
				PRODUCTSU21_Hickerson productB2 = new PRODUCTSU21_Hickerson('B', numOfBUnits2, 350.99f);
				print(printCompareMonthlySaleReport(productA1, productB1, productA2, productB2));
			} catch (FileNotFoundException e) {
				print("File does not exist");
			}
		}

		file1.close();
		file2.close();

	}

}
