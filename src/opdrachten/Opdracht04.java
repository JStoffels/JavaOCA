package opdrachten;

import java.util.Scanner;

public class Opdracht04 {
	
	public static void main (String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter length..");		
		int length = Integer.valueOf(s.next());
		
		System.out.println("Enter width..");
		int width = Integer.valueOf(s.next());
		
		System.out.println("Enter height..");
		int height = Integer.valueOf(s.next());
		
		System.out.println("The volume is: " + (length * width * height));
		System.out.println("The surface area is :" + (length * width));
		
		s.close();
	
	}

}
