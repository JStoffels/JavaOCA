package testdemo;

import java.util.Scanner;

public class H4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string, min 5 characters...");
		
		String string = new String(s.next());		
		
		System.out.println("charAt index 3 (positie 4) is: " + string.charAt(3)); //geeft char op positie 4, index 3
	
		System.out.println("De positie van H is: " + (string.indexOf('H') + 1)); //zoekt in string voor een String of char, H, +1 ivm. index
		
		System.out.println("Substing vanaf index 2 tot 5: " + string.substring(2, 5)); //geeft substring vanaf index 2 tot 4, niet t/m 5!
		
		System.out.println("String zonder white spaces aan het begin of eind: " + string.trim()); //haalt white spaces weg voor of na string
		
		System.out.println("Vervangt alle H met h: " + string.replace('H', 'h')); //vervangt alle H met h, "string" door 'char' vervangen kan niet
		
		System.out.println("Vervangt alle A met 1: " + string.replace("A", "1")); //idem, alleen "A" door "1", waarde van string veranderd niet!
		
		System.out.println("De lengte van de string is: " + string.length()); //geeft lengte van een string, niet de index locatie
		
		System.out.println("Start de string met AB?: " + string.startsWith("AB")); //geeft true/false als string wel of niet met AB begint, alleen string waarden!
		
		System.out.println("Eindigt de string met .com?: " + string.endsWith(".com")); //geeft true/false als de string wel of niet met .com eindigt
		
		System.out.println("" + 1 + 5 + string); //concatenatie, telt 1 + 5 niet op ivm eerste string
		
		System.out.println(1 + 5 + string);  //concatenatie, telt 1 + 5 wel op
		
		System.out.println(string += "Test!"); //voegt Test! toe na string
		
		System.out.println(new H4());
		
		
		
		
	}
}
