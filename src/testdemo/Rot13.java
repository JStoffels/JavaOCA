package testdemo;

import java.util.Scanner;

public class Rot13 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string...");
		String str = s.nextLine();
		System.out.println(rot13(str));
}

public static String rot13 (String str){
		char[] ca = str.toCharArray();
		char[] code = new char [ca.length];
		for (int i = 0; i < ca.length; i++) {
			if (ca[i] == ' ') {
				code[i] = ' ';
			} 
			else if ((int) ca[i] > 96) {
				code[i] = (char) (((((int) ca[i] - 97) + 13) % 26) +97);
				}
			else {
				code[i] = (char) (((((int) ca[i] - 65) + 13) % 26) + 65);
			}
		}
		
		return new String(code);
	}
	

}


