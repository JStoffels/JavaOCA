package opdrachten;

import java.util.Scanner;

public class Opdracht09 {
	
	public static void main(String[] args){
	
		Scanner s = new Scanner(System.in);
		System.out.println("Voer een getal in...");
		int x = Integer.valueOf(s.next());
		
		if (x>1 && x<10) {
			System.out.println("Number accepted.");
		} else { System.out.println("Number declined, enter a number between 1 and 10.");
		}	
		
		s.close();
	}
}
