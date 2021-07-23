// File name: SaleEmployee_Hickerson.java

package com.lab4;

public class SaleEmployee_Hickerson {

	// Class fields
	String name = "";
	String employeeID = "";
	float sales = 0;
	final float baseSalary = 2500;
	
	// Constructors
	public SaleEmployee_Hickerson() {}
	
	public SaleEmployee_Hickerson(String iName, String iID, float iSales) {
		
		name = iName;
		employeeID = iID;
		sales = iSales;
		
	}
	
	// Calculation methods
	public float calculateCommission() {
		
		if (sales < 12000) return 0;
		
		float commission = 2.69f;
		float commTotal = (commission/100) * sales;
		return commTotal;
	}
	
	public float calculateBonus() {
		
		if(sales <= 15000) return 0;
		
		float bonus = 0;
		float difference = 0;
		bonus = 2.79f; 
		difference = sales - 15000;
		
		float bonTotal = (bonus/100) * difference;
		
		return bonTotal;
	}
	
	public float calculateTotalPay() {
		
		float totalPay = baseSalary + calculateBonus() + calculateCommission();
	
		return totalPay;
	}
	
	// .toString method to format calculations and other outputs
	public String toString() {
		
		StringBuilder sb = new StringBuilder(String.format("Name of Sale Representative: %20s\n", name));
		sb.append(String.format("Employee ID: %36s\n", employeeID));
		sb.append(String.format("Sale amount: %36.2f\n", sales));
		sb.append("-------------------------------------------------\n");
		sb.append(String.format("Base salary: %36.2f\n", baseSalary));
		sb.append(String.format("Commission amount: %30.2f\n", calculateCommission()));
		sb.append(String.format("Bonus amount: %35.2f\n", calculateBonus()));
		sb.append(String.format("Salary: %41.2f\n", calculateTotalPay()));
		sb.append("-------------------------------------------------\n");
		return sb.toString();
		
	}
}
