package opdrachten;

import java.util.Scanner;

public class Opdracht02 {
	
	public static void main(String[] args) { 
		
		Scanner s = new Scanner(System.in);			
		System.out.println("Enter a temperature in Celsius..");	
		int input = Integer.valueOf(s.next());		
		int output = (int) ((input * 1.8) + 32);	
		System.out.println(output);
		
		s.close();
		
	
	}

}
