package opdrachten;

import java.util.Scanner;

public class Opdracht18 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Voer een getal in...");
		int n = Integer.valueOf(s.next());
		int youd = 0;
		int ynieuw = 1;
		int counter = 2;
		int y = 0;

		while (counter != n) {
			y = youd + ynieuw;	
			++counter;
			youd = ynieuw;
			ynieuw = y;
			
		}
		System.out.println(ynieuw);
	}

}
