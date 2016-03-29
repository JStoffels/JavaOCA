package opdrachten;

import java.util.Scanner;

public class Opdracht03 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter the length of the first leg..");		
		int leg1 = Integer.valueOf(s.next());
		
		System.out.println("Enter the length of the second leg..");
		int leg2 = Integer.valueOf(s.next());
		
		System.out.println("The length of the hypotenuse is " + Math.sqrt(leg1*leg1 + leg2*leg2));
		
		s.close();
		
	}

}
