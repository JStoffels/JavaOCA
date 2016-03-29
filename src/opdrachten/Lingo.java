package opdrachten;

import java.util.ArrayList;
import java.util.Scanner;

public class Lingo {

	public static void main(String[] args) {

		String lingo = "lingo";

		Scanner s = new Scanner(System.in);
		char again = 'y'; 

		while (again == 'y') { 

			System.out.println("Enter a 5 letter word...");
			String str = s.next();

			ArrayList<Character> invoerwoord = new ArrayList<>();
			for (int i = 0; i<5; i++) { 
				invoerwoord.add(str.charAt(i));
			}

			ArrayList<Character> lingowoord = new ArrayList<>();
						for (int i = 0; i<5; i++) {
				lingowoord.add(lingo.charAt(i));
			}

			ArrayList<Character> uitvoer = new ArrayList<>();		
			for (int i = 0; i<5; i++) {
				if (invoerwoord.get(i) == lingowoord.get(i)) {
					uitvoer.add('x');
				} else if (lingowoord.contains(invoerwoord.get(i))) {
					uitvoer.add('o');
				} else uitvoer.add('.');
			}

			System.out.println(uitvoer);
			System.out.println("Try again? <y/n>");
			again = s.next().charAt(0);
		}
		s.close();
	}
}
