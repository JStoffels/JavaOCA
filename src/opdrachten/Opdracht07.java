package opdrachten;

import java.util.Scanner;

public class Opdracht07 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a value for X...");
		int x = Integer.valueOf(s.next());
		
		System.out.println("Enter a value for Y...");
		int y = Integer.valueOf(s.next());
		
		if (x == 8) { 
			x = 1;	}		
		else x = 2;
		
		if (x<y) { 
			x = x * 2;	}
		else x = x + 1;
		
		if (x>y) { 
			x = x + 1;
			y = y + 1;	}
		else x = x - 1; 
			 y = y - 1;
		
			 
		System.out.println("X = " + x + "Y = " + y);
		
		s.close();
	}
}
