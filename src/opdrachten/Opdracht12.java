package opdrachten;

import java.util.Scanner;

public class Opdracht12 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number one...");
		int n1 = Integer.valueOf(s.next());
		
		System.out.println("Enter number two...");
		int n2 = Integer.valueOf(s.next());
		
		System.out.println("Enter number three...");
		int n3 = Integer.valueOf(s.next());
		
		if (n1 + n2 >= n3 || n1 + n3 >= n2 || n2 + n3 >= n1) {
			System.out.println("These numbers represent the sides of a triangle.");
		}
		else System.out.println("These numbers do not represent the sides of a triangle.");
		
		s.close();
	}
}
