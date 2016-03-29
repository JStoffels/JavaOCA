package opdrachten;

import java.util.Scanner;

public class Opdracht05 {
	
	public static void main(String[] args) { 
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter X..");
		int x = Integer.valueOf(s.next());
		
		System.out.println("Enter Y..");
		int y = Integer.valueOf(s.next());
		
		if ((x / y) == 5) { 
			x = 100;
			System.out.println("X is: " + x);
			}
		
		else if ((x*y)==5) {
			x = 1;
			System.out.println("X is: " + x);
			}
		
		else if (x<y) { 
			x = x * 2;
			System.out.println("X is: " + x);
		}
		
		else if (x>y) {
			x = x + 1;
			System.out.println("X is: " + x);
		}
		
		else System.out.println("X is: " + x);
		
		s.close();
		
		}
	
}
	


