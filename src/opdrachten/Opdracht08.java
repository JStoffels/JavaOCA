package opdrachten;

import java.util.Scanner;

public class Opdracht08 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter number one...");
		int i1 = Integer.valueOf(s.next());
		
		System.out.println("Enter number two...");
		int i2 = Integer.valueOf(s.next());
		
		System.out.println("Enter number three...");
		int i3 = Integer.valueOf(s.next());
		
		int x = 0;
		
		if (i1>i2) { 
			x = i1;	}
		else x = i2;
			
		if (i3>i2) {
			x = i3;	}
		
		System.out.println("The largest number is: " + x);
			
		s.close();
	}
	
	
}
