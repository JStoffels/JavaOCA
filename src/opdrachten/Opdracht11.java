package opdrachten;

import java.util.Scanner;
import java.util.ArrayList;

public class Opdracht11 {

	public static void main(String[] args) {
		
		// producten declareren + lijst maken + producten toevoegen aan lijst
		ArrayList<Integer> productlist = new ArrayList<Integer>();
		int p1 = 295; productlist.add(p1);
		int p2 = 499; productlist.add(p2);
		int p3 = 549; productlist.add(p3);
		int p4 = 780; productlist.add(p4);
		int p5 = 885; productlist.add(p5);		
		
		System.out.println("Enter the product number...");
		Scanner s = new Scanner(System.in);
		int input = Integer.valueOf(s.next());
		int pnr = input - 1;
		
		System.out.println("Enter the quantity...");
		int input2 = Integer.valueOf(s.next());
		int qty = input2; 
		
		System.out.println("The retail value is: " + (productlist.get(pnr)*qty)/100.0);
		
		/*  //productenlijst
		for (double item : productlist) {
			System.out.println("The productprice is: " + item);
		}
		*/
		
		s.close();
	}
	
}
