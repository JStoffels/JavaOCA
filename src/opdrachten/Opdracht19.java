package opdrachten;

import java.util.Scanner;

public class Opdracht19 {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a word...");
		String word = s.next();
		
		int counter = 0;
		
		for(int i=0; i<word.length(); i++) {
			if(word.charAt(i) == 'a') {
				counter++;
			}	
			
		}
		System.out.println(counter);
		s.close();
	}

}
