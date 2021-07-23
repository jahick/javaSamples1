package com.lab3;
// File name: Customer_Hickerson

public class Customer_Hickerson {

	String name = "";
	String accountNumber = "";
	float money = 0;
	float interestRate = 0;
	
	public Customer_Hickerson() {}
	
	public Customer_Hickerson(String iName, String iAccNum, float iMoney, float iIntRate) {
		
		name = iName;
		accountNumber = iAccNum;
		money = iMoney;
		interestRate = iIntRate;
		
	}
	
	public float calculateSavings() {
		
		float decimalMultiplier = interestRate/100;
		float savings = (money + (money * decimalMultiplier));
		return savings;
		
	}
	
	public String toString() {
		
		StringBuilder sb = new StringBuilder(String.format("Name of Bank Customer: %19s\n", name));
		sb.append(String.format("Amount of Money: %25.2f\n", money));
		sb.append(String.format("Interest Rate: %27.2f%%\n", interestRate));
		sb.append("------------------------------------------\n");
		sb.append(String.format("Total Saving Money: %22.2f\n", calculateSavings()));
		return sb.toString();
		
	}
	
}

