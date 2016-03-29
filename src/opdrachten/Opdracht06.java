package opdrachten;

import java.util.Scanner;

public class Opdracht06 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter first test score..");
		int score1 = Integer.valueOf(s.next());
		
		System.out.println("Enter second test score..");
		int score2 = Integer.valueOf(s.next());
		
		System.out.println("Enter third test score..");
		int score3 = Integer.valueOf(s.next());
		
		System.out.println("Enter fourth test score..");
		int score4 = Integer.valueOf(s.next());
		
		System.out.println("Enter fifth test score..");
		int score5 = Integer.valueOf(s.next());
	
		int uitslag = 0;
				
		if (score1 > 7) { 
		uitslag = uitslag + score1;
		}
		
		if (score2 > 7) { 
			uitslag = uitslag + score2;
			}
		
		if (score3 > 7) { 
			uitslag = uitslag + score3;
			}
		
		if (score4 > 7) { 
			uitslag = uitslag + score4;
			}
		
		if (score5 > 7) { 
			uitslag = uitslag + score5;
			}
		
		System.out.println("Total count is: " + uitslag);	
		
		s.close();
		
	}
	
}
