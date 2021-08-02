// File name: SU2021_StudentGradingApplication_Hickerson

package com.lab6_part2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SU2021_StudentGradingApplication_Hickerson {
	
	// static variables
	static Scanner read = new Scanner(System.in);
	public static String dash = "------------------------------------------------------ \n";
	public static String file = "File: SU2021_StudentGradingApplication_Hickerson.java \n";

	
	// custom print function
	public static void print(Object arg0) 
		{System.out.println(arg0);}

	
	 /*************************************************
	 * Displays user's options and accepts user input *
	 * @return	the user's selection				  *
	 *************************************************/
	
	public static int menu() {
		String display = file 
				+ "GRADING MENU – Jada Hickerson \n" 
				+ dash
				+ "1. Grade One Student \n" 
				+ "2. Display the Grades of Class \n"
				+ "0. Exit \n" 
				+ "\nEnter 1 or 2 to complete a task or 0 to exit: ";

		print(display);
		int choice = read.nextInt();
		read.nextLine();
		return choice;
		
	}

	// main method
	public static void main(String[] args) throws IOException {
		
		int task = -1;
		
		while (task != 0) {
			
			task = menu();
			
			switch (task) {
			
			case 1:		// option 1
			
				print("Enter your first name: ");
				String fn = read.nextLine();
				print("Enter your last name: ");
				String ln = read.nextLine();
				print("Enter your student ID: ");
				String sid = read.nextLine();
			
				float grades[] = new float[3];
				System.out.println("Enter each of your three test grades: ");
			
				for (int i = 0; i < grades.length; i++) {		// for loop to loop through three successive
					grades[i] = read.nextFloat();				// inputs to receive three test scores.
					if (grades[i] > 100) {						// if user inputs grade higher than 100,
						grades[i] = 100;						// grade will correct to 100.
					}
				}
				
				read.nextLine();
				print("");
				
				Student_Hickerson student_info = new Student_Hickerson(sid, ln, fn, grades);
				
				print(student_info.toString());
				
				File myf = new File("scoreInfo.txt");		// create text file and print output to it
			    myf.createNewFile();
			    FileWriter myw = new FileWriter("scoreInfo.txt");
			    myw.write(student_info.toFile());
			    myw.close();
			
			    break;
			    
			case 2:		// option 2
				
				print("");
				print("File: SU2021_StudentGradingApplication_Hickerson.java");
				print("LIST OF CLASS GRADES - Jada Hickerson");
				print("------------------------------------------------------");
				
				Scanner file = new Scanner(new File("/Users/hicke/Downloads/studentInfo.txt"));
				while (file.hasNextLine()) {				 
					String line = file.nextLine();			// read and split each line into separate strings and add them to an array
					String[] lines = line.split("-");		
			        for (int i = 0; i < 1; i++) {
			        	print(String.format("Student ID: %42s", lines[0])); 		// use positions of strings in array to print info
			        	String studentName = lines[2] + " " + lines[1];	
			        	print(String.format("Student name: %40s", studentName)); 
			       		print(String.format("Percentage: %41s%%", lines[3]));
			       		print(String.format("Letter Grade: %40s", lines[4]));
			       		print("------------------------------------------------------");
			       	}
				}
				
				print("");	
				break;
				
			case 0:		// option 0
				
				break;
				
			default:	// if user selection is not a programmed choice
				
				print("");
				print("Invalid input. Please select 1, 2, or 0.");
				print("");
				
			}
		}
	}
}
