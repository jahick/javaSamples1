package com.lab3;
// File name: Adult_Hickerson.java

public class Adult_Hickerson {

	String name = "";
	int height = 0;
	float expectedBMI = 0;
	
	/*
	 * Calculates weight based on height and expected BMI
	 * returns  (double)
	 */
	
	public  double calculateWeight() { 
		
		double weight = (double) ((expectedBMI * height * height)/703);
		return weight;
	}

	

	@Override
	
	  public String toString() {
	  
	  StringBuilder sb = new StringBuilder(String.format("Name: %43s\n", name));
	  sb.append(String.format("Height (inches): %32d\n", height));
	  sb.append(String.format("BMI: %44.1f\n", expectedBMI));
	  sb.append("-------------------------------------------------\n");
	  sb.append(String.format("Weight (pounds): %32.1f\n", calculateWeight()));
	  return sb.toString(); 
	  
	}
	 
	
	
	// Default constructor
	public Adult_Hickerson() {}
	
	/*
	 * param inputName 
	 * param inputHeight
	 * param inputExpectedBMI
	 */
	public Adult_Hickerson(String inputName, int inputHeight, float inputExpectedBMI) {
	
		name = inputName;
		height = inputHeight;
		expectedBMI = inputExpectedBMI;
	}
}

