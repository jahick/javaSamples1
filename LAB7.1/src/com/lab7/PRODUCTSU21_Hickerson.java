// File name: PRODUCTSU21_Hickerson.java

package com.lab7;

public class PRODUCTSU21_Hickerson {

	char model;
	int units;
	float unitPrice;
	
	public PRODUCTSU21_Hickerson() {}
	
	public PRODUCTSU21_Hickerson(char iModel, int iUnits, float iUnitPrice) {
		model = iModel;
		units = iUnits;
		unitPrice = iUnitPrice;
	}
	
	public float getMoney() {
		
		float money = unitPrice * units;
		return money;
	}

	public int getUnits(){
	
		return units;
	}
	
	public String toString() {
		return String.format("SU21Product%1c %10.2f %7d %10.2f \n",
				Character.toUpperCase(model) , 
				unitPrice , 
				units , 
				getMoney());
		
		
	}
}
