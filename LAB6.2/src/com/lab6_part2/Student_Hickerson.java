// File name: Student_Hickerson.java

package com.lab6_part2;

public class Student_Hickerson {

	private String studentID;
	private String lastName;
	private String firstName;
	private float[] scores = new float[3];
	
	Student_Hickerson() {}
	
	
	Student_Hickerson(String sid, String ln, String fn, float[] grades) {
		
		studentID = sid;
		lastName = ln;
		firstName = fn;
		scores = grades;
		
	}
	
	/*************************************************************
	* Calculates user's total score for all three tests          *
	* @return	the user's total score 				             *
	*************************************************************/
	
	public float calculateTotal() {
		
		float total = scores[0] + scores[1] + scores[2];
		return total;
	}
	
	
	/*************************************************************
	* Calculates user's average test percentage score   	     *
	* @return	the user's test average as a percent    	     *
	*************************************************************/
	
	public float calculatePercentage() {
		
		float percentage = 100 * calculateTotal() / 300;
		return percentage;
	}
	
	
	/*************************************************************
	* Assigns user a letter grade based on calculated percentage *
	* @return	the user's letter grade 				         *
	*************************************************************/
	
	public char calculateGrade() {
		
		char grade;
		
		if (calculatePercentage() >= 90) {grade = 'A';}
		else if (calculatePercentage() >= 80) {grade = 'B';}
		else if (calculatePercentage() >= 70) {grade = 'C';}
		else if (calculatePercentage() >= 60) {grade = 'D';}
		else {grade = 'F';}
		
		return grade;
	}
	
	public String toString() {
		
		String name = firstName + " " + lastName;
		
		String console_str = "File: SU2021_StudentGradingApplication_Hickerson.java \n"
				+ "STUDENT GRADING APPLICATION - Jada Hickerson \n"
				+ "------------------------------------------------------ \n"
				+ String.format("Student ID: %42s \n", studentID)
				+ String.format("Student name: %40s \n", name)
				+ String.format("Total of Scores: %31.2f", calculateTotal()) + " / 300 \n"
				+ String.format("Percentage: %41.2f%% \n", calculatePercentage())
				+ String.format("Letter Grade: %40c \n", calculateGrade());
		
		return console_str;
	}
	
	public String toFile() {
		
		String file_str = studentID + "-" 
				+ lastName + "-" 
				+ firstName + "-" 
				+ calculatePercentage() + "-" 
				+ calculateGrade();
		
		return file_str;
		
	}
}
