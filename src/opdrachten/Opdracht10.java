package opdrachten;

import java.util.Scanner;

public class Opdracht10 {
	
	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
	System.out.println("Are you sure you want to quit [Y, N]");
	String input = s.next();
	
	if (input.equals("Y")) { 
		System.out.println("Closing program.");	} 
	
	else if (input.equals("N")) { 
		System.out.println("Program not closing.");	} 
	
	else System.out.println("Enter a valid answer.");
	
	s.close();
	
	}
	
}
