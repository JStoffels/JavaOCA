package testdemo;

import java.util.Scanner;

public class IODemo {

	public static void main(String[] args) {
		System.out.println("Voer iets in..");

		Scanner s = new Scanner(System.in);
		String input = s.next();
		
		System.out.println("Uw invoer was: " + input);
		
		s.close();
		
	}

}
