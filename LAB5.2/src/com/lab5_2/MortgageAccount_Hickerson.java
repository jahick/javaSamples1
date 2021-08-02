// File: SU2021_MortgageService_Hickerson.java

package com.lab5_2;

/**
 * Mortgage service class
 * @author Jada Hickerson
 * 
 */

public class MortgageAccount_Hickerson {

	String firstName;
	String lastName;
	float principal;
	float interestRate;
	int numOfPayments;
	String accountNumber;

	public MortgageAccount_Hickerson() {}
	
	public MortgageAccount_Hickerson(String fn, String ln, float prncpl, float ir, int nop) {
		
		/**
		 * The account holder's first name
		 */
		firstName = fn;
		lastName = ln;
		principal = prncpl;
		interestRate = ir;
		numOfPayments = nop; 
		
		// create StringBuffer size of 10
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
        	  
            // generate a random number between
            // 0 to numbers variable length
            int index = (int)(10 * Math.random());
  
            // add Character one by one in end of sb
            sb.append(index);
        }
        accountNumber = sb.toString();
	
	}
	
	public String toString() {
		
		String name = lastName + ", " + firstName;
		
		String output_str = String.format("Account number: %30s\n", accountNumber)
				+ String.format("Name: %40s\n", name)
				+ String.format("Principal: %35.3f\n", principal)
				+ String.format("Number of payments: %26d\n", numOfPayments)
				+ String.format("Interest rate: %30.3f%%\n", interestRate);
				
        return output_str; 
        
	}
		
	/**
	 * Displays the account information
	 * @param	monthlyPayment	 the monthly payment
	 * @return	the account information
	 */
	
	public String openNewAccount(float monthlyPayment) {
		
		String name = lastName + ", " + firstName;
		
		String output_str = "File: SU2021_MortgageService_Hickerson.java \n"
				+ "OPEN NEW ACCOUNT - Jada Hickerson \n"
				+ "---------------------------------------------- \n"
				+ String.format("Account number: %30s\n", accountNumber)
				+ String.format("Name: %40s\n", name)
				+ String.format("Principal: %35.3f\n", principal)
				+ String.format("Number of payments: %26d\n", numOfPayments)
				+ String.format("Interest rate: %30.3f%%\n", interestRate)
				+ "---------------------------------------------- \n"
				+ String.format("Monthly payment: %29.3f\n", monthlyPayment);
        
        return output_str; 
        
	}

	/**
	 * Displays the interest rate
	 * @return	the account holder's interest rate
	 */
	
	public String checkInterestRate() {
		
		String name = lastName + ", " + firstName;
		
		String output_str = "File: SU2021_MortgageService_Hickerson.java \n"
				+ "CHECK INTEREST RATE - Jada Hickerson \n"
				+ "---------------------------------------------- \n"
				+ String.format("Account number: %30s\n", accountNumber)
				+ String.format("Name: %40s\n", name)
				+ String.format("Interest rate: %30.3f%%\n", interestRate);
				
        return output_str; 
        
	}
	
	/**
	 * Displays the principal
	 * @return	the account holder's current principal
	 */
	
	public String checkCurrentPrincipal() {
		
		String name = lastName + ", " + firstName;
		
		String output_str = "File: SU2021_MortgageService_Hickerson.java \n"
				+ "CHECK CURRENT PRINCIPAL - Jada Hickerson \n"
				+ "---------------------------------------------- \n"
				+ String.format("Account number: %30s\n", accountNumber)
				+ String.format("Name: %40s\n", name)
				+ String.format("Principal: %35.3f\n", principal); 
		
		return output_str; 
		
	}
	
	/**
	 * Displays the updated account information after payment
	 * @param monthlyPayment	the monthly payment
	 * @param paymentAmount		the amount paid
	 * @return	the account holder's updated account information payment
	 */
	
	public String processPayment(float monthlyPayment, float paymentAmount) {
		
		float interestAmount = principal * interestRate/100/12;
		float newPrincipal = principal - (paymentAmount - interestAmount);
		numOfPayments --;
		
		String name = lastName + ", " + firstName;
		
		String output_str = "File: SU2021_MortgageService_Hickerson.java \n"
				+ "PROCESS MONTHLY PAYMENT - Jada Hickerson \n"
				+ "---------------------------------------------- \n"
				+ String.format("Account number: %30s\n", accountNumber)
				+ String.format("Name: %40s\n", name)
				+ String.format("Principal: %35.3f\n", principal)
				+ String.format("Number of payments: %26d\n", numOfPayments)
				+ String.format("Interest rate: %30.3f%%\n", interestRate)
				+ String.format("Monthly payment: %29.3f\n", monthlyPayment)
				+ String.format("Amount you pay: %30.3f\n", paymentAmount)
				+ String.format("Interest amount this month: %18.3f\n", interestAmount)
				+ "---------------------------------------------- \n"
				+ String.format("Principal: %35.3f\n", newPrincipal);
		
		principal = newPrincipal;
        
        return output_str;
		
		
	}
	
}
