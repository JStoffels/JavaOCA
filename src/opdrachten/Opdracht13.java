package opdrachten;

import java.util.Scanner;

public class Opdracht13 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the length of the first leg...");
		double a = Double.valueOf(s.next());
		
		System.out.println("Enter the length of the second leg...");
		double b = Double.valueOf(s.next());
		
		a = a * a;
		b = b * b;
		
		double c = (double) Math.sqrt(a + b);
		
		if (a == b || a == c || b == c) {		
		System.out.println("These leg lengths represent a right triangle.");
		} else System.out.println("These leg lengths do not represent a right triangle.");
		
		s.close();
	}
	
}
