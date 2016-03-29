package opdrachten;

import java.util.Scanner;
import java.util.ArrayList;

public class Opdracht17 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number...");

		int number = Integer.valueOf(s.next());

		ArrayList<Integer> list = new ArrayList<Integer>();

		for (double x = number - 1; 2 <= x; x--) {

			double y = number / x;
			if ((y % 1) == 0) {
				list.add((int) y);
			}
		}

		int size = list.size();

		if (size >= 1) {
			System.out.println("geen priemgetal");
		} else {
			System.out.println("wel priemgetal");
		}

		System.out.println(list.size());
		list.clear();
		
		
	}
}
