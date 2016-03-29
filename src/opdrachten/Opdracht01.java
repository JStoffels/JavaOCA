package opdrachten;

import java.util.Scanner;

public class Opdracht01 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter an article..");		
		String inputArticle = s.next();
	
		System.out.println("Enter a noun..");
		String inputNoun = s.next();
		
		System.out.println("Enter a verb..");
		String inputVerb = s.next();
		
		System.out.println("Your sentence is: " + inputArticle + " " + inputNoun + " " + inputVerb);
		
		s.close();
		
		}

}
