// File name: SaleProductSU21Service_Hickerson.java

package com.lab7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SaleProductSU21Service_Hickerson {

	// static variables
	static String stringDate;
	static Scanner read = new Scanner(System.in);
	public static String dash = "------------------------------------------------------ \n";
	public static String file = "File: SaleProductSU21Service_Hickerson.java \n";

	static int nextInt = 0;

	// custom print function
	public static void print(Object arg0) {
		System.out.println(arg0);
	}

	/*************************************************
	 * Displays user's options and accepts user input *
	 * 
	 * @return the user's selection *
	 *************************************************/

	public static int menu() {
		String display = file + "SU21Product Menu – Jada Hickerson \n"
				+ "Day:" + stringDate+ "\n"
	+ dash + "1. SU21Product A \n"
				+ "2. SU21Product B \n" + "0. Exit \n" + "\nEnter 1 or 2 to complete a task or 0 to exit: ";

		print(display);
		int choice = read.nextInt();
		read.nextLine();
		return choice;

	}

	public static String printReceipt(PRODUCTSU21_Hickerson a, PRODUCTSU21_Hickerson b) throws IOException {
		float subtotal = a.getMoney() + b.getMoney();
		float taxAmount = subtotal * .0825f;
		float total = subtotal + taxAmount;
		int transactionNumber = nextInt++;
		String total_str = "Your total is " + total;
		//print(total_str);
		print("How much money was paid?");
		float moneyPaid = read.nextFloat();
		read.nextLine();
		float change = moneyPaid - total;
		
		String space = "                       ";
		String transactionNumberFormatted = String.format("%04d", transactionNumber);
		String receipt_str = file + "Sale SU21Product Receipt -- Jada Hickerson \n" + "Day: " + stringDate + space
				+ transactionNumberFormatted +"\n" + dash + a.toString() + b.toString() + dash
				+ String.format("Subtotal: %32.2f \n", subtotal) + String.format("Tax: %37.2f \n", taxAmount)
				+ String.format("Total: %35.2f \n", total) + String.format("Money Paid: %30.2f \n", moneyPaid)
				+ String.format("Change: %34.2f", change);
		String fileName = "dayFile_" + stringDate.replace("/", "") + ".txt";
		File myf = new File(fileName);
		File parentDir = myf.getParentFile();
		String output = String.format("%s %d %d \n", transactionNumberFormatted, a.getUnits(), b.getUnits());
		if (parentDir != null && !parentDir.exists())
			parentDir.mkdirs();// create text file and print output to it
		FileWriter myw = new FileWriter(fileName);
		if(myf.createNewFile()) {
			
			
			myw.write(output);
			myw.close();
		}else {
			StringBuilder sb = new StringBuilder();
			Scanner file = new Scanner(new File(fileName));
			while (file.hasNextLine()) {				 
				String line = file.nextLine();			// read and split each line into separate strings and add them to an array
				sb.append(line);
			}
			sb.append(output);
			myw.write(sb.toString());
			myw.close();
		}
		

		return receipt_str;
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String pattern = "MM/dd/yyyy";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date date = new Date();
		stringDate = simpleDateFormat.format(date);
		int task = -1;
		int numOfUnitsToBuyA = 0;
		int numOfUnitsToBuyB = 0;
		while (task != 0) {

			task = menu();

			switch (task) {
			case 1:
				print("How many units of Product A do you want to buy?");
				int a = read.nextInt();
				numOfUnitsToBuyA += a;
				read.nextLine();
				break;
			case 2:
				print("How many units of Product B do you want to buy?");
				int b = read.nextInt();
				numOfUnitsToBuyB += b;
				read.nextLine();
				break;
			case 0:
				PRODUCTSU21_Hickerson productA = new PRODUCTSU21_Hickerson('A', numOfUnitsToBuyA, 219.99f);
				PRODUCTSU21_Hickerson productB = new PRODUCTSU21_Hickerson('B', numOfUnitsToBuyB, 350.99f);
				print(printReceipt(productA, productB));

				break;
			default:
				print("");
				print("Invalid input. Please select 1, 2, or 0.");
				print("");
			}
		}
		
		

		read.close();

	}

}
