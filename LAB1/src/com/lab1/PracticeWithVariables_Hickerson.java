package com.lab1;
// File name is "PracticeWithVariables_Hickerson.java"
import java.util.Scanner;  // Import the Scanner class

public class PracticeWithVariables_Hickerson 

{
    public static void main(String args[])
    
    {

        // Create a Scanner object
        Scanner myObj = new Scanner(System.in);  

        // Prompt for user input, Read user input, Assign user input to variable 
        
        // --> 3 words are accepted as individual string inputs and stored as variables
        System.out.print("Enter your first word: ");  
        String word1 = myObj.nextLine();  
        
        System.out.print("Enter your second word: ");
        String word2 = myObj.nextLine(); 
        
        System.out.print("Enter your third word: ");
        String word3 = myObj.nextLine(); 

        // --> 2 numbers are accepted as individual float inputs and stored as variables
        System.out.print("Enter your first number: ");  
        Float num1 = myObj.nextFloat();  

        System.out.print("Enter your second number: ");  
        Float num2 = myObj.nextFloat();  

        // Calculate average and store result as variable
        float avg = (num1 + num2)/2;

        // Output user input and lab info
        System.out.println("-----------------------------------------------------------");
        System.out.println("File: PracticeWithVariables_Hickerson.java"); 
        System.out.println("Summer Semester - Jada Hickerson");
        System.out.println("-----------------------------------------------------------");
        System.out.println("First word: " + word1);
        System.out.println("Second word: " + word2);
        System.out.println("Third word: " + word3);
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);
        System.out.println("The average of " + num1 + " and " + num2 + " is " + avg);
        System.out.println("-----------------------------------------------------------");

        // Close the Scanner object
        myObj.close();
    }

}
