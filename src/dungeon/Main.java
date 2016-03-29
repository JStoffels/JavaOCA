package dungeon;

import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		GameWorld x = new GameWorld();
		Player p = new Player();
		Scanner s = new Scanner(System.in);
		boolean life = true;

		while (life) {
			x.getSquare(p.getX(), p.getY());
			System.out.println("Je bent hier: " + "[" + p.getY() + "." + p.getX() + "]");
			System.out.println(x.getSquare(p.getX(), p.getY()).getDescription());
			System.out.println("Waar wil je heen? N/W/E/S");
			p.setCoords(s.next().toUpperCase());
		}
		s.close();
	}

}
