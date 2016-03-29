package winkel;

import java.util.Scanner;
import java.io.IOException;
import java.util.ArrayList;

public class Product {

	private String naam;
	private int prijspereenheid;
	private int prijs;
	private int btwpercentage;
	private static int eenheid;
	private int voorraad;
	private boolean inclusief;
	private static String eenheidnaam;




	// constructor
	Product(String s, int p, int v, int e) {
		naam = s;
		prijspereenheid = p;
		voorraad = v;
		eenheid = e;	}


	// methoden	
	public String getNaam() {
		return naam;}

	public int getPrijsPerEenheid() {
		return prijspereenheid; }

	public int getPrijs(int hoeveelheid, boolean inclusief) {
		if (inclusief = true){
			int prijs = ((hoeveelheid * 121) / 100);
			return prijs;}
		else return prijs; }

	public int getPrijs(int hoeveelheid) {
		int prijs = ((hoeveelheid * 121) / 100);
		return prijs; }

	public int getPrijs(){
		return getPrijsPerEenheid(); }

	public int getBtwPercentage() {
		return btwpercentage; }

	public int getEenheid() {
		return eenheid; }

	public static String getEenheidNaam(){		
		if (eenheid == 1){
			eenheidnaam = "gram"; }		
		else if (eenheid == 2){
			eenheidnaam = "kilo"; }		
		else if (eenheid == 3){
			eenheidnaam = "liters"; }		
		else if (eenheid == 4){
			eenheidnaam = "stuk"; }		
		else if (eenheid == 5){
			eenheidnaam = "pak"; }		
		return eenheidnaam; }

	final public int getVoorraad() {
		if (voorraad <= 0) {
			throw new ArithmeticException("Voorraad kan niet lager dan 0 zijn.");
		} else		
			return voorraad; }

	void setVoorraad(int voorraad){	}

	void haalUitVoorraad(int aantal){
		voorraad = voorraad - aantal; }	

	// main
	/*public static void main(String[] args){
		Product p1 = new Product("Boek OCA", 5, 500, 1);
		Product p2 = new Product("Boek Scrum", 10, 100, 2);
		Product p3 = new Product("Boek EHBO", 15, 75, 2);

		System.out.println("Productnaam:     " + "Prijs:     " + "Voorraad:     " + "Eenheid:     ");
		System.out.println("1:" + p1.naam + "            " + p1.prijs + "         " + p1.voorraad + "          " + p1.eenheid);
		System.out.println("2:" + p2.naam + "         " + p2.prijs + "         " + p2.voorraad + "          " + p2.eenheid);
		System.out.println("3:" + p3.naam + "          " + p3.prijs + "          " + p3.voorraad + "          " + p3.eenheid);

		System.out.println("Selecteer product...");
		Scanner q = new Scanner(System.in);
		int w = Integer.valueOf(q.next());
		System.out.println("Voer hoeveelheid in...");
		int z = Integer.valueOf(q.next());

		class Winkelwagen {

			ArrayList<Winkelwagen> winkelwagen = new ArrayList<Winkelwagen>();

			public String bestel() { 
				return System.out.println(p1.naam);
			}
	 */
}












