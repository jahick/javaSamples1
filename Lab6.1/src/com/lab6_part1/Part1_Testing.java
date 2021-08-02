package com.lab6_part1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;



public class Part1_Testing {

	public static void main(String[] args) throws IOException {
		
		// QUESTION 3:
		
		File f = new File("output.txt");
	    f.createNewFile();
	    FileWriter w = new FileWriter("output.txt");

	    int[ ] Numbers = { 57, 25, 14, 63, 38, 42, 15, 80, 76, 40 };

	    int i;
	    
	    for (i = 0; i < 9; i++) {

	    	w.write("\nNumbers ");
	    	w.write(i);
	    	w.write(" = ");
	    	w.write(Numbers[i]);

	    }

	    w.close();

	    System.out.println("Done.");
	    

	    for (i = 0; i < 9; i++) {

	    	System.out.print("\nNumbers ");
	    	System.out.print(i);
	    	System.out.print(" = ");
	    	System.out.print(Numbers[i]);
		    
		// QUESTION 4:    
	    	
	    
		    

	    }
	    
	}

}
