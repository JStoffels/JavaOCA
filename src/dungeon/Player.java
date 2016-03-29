package dungeon;

public class Player{	
	
	private int y = 0;
	private int x = 0;

	public int getX() { return x; }
	public int getY() { return y; }
	
	public void setCoords(String move) {
		switch (move) {
		case "E": x++;break; 
		case "N": y--;break;
		case "W": x--;break;
		case "S": y++;break;
		default: System.out.println("Voer een geldige richting in...");
		}
		
	} 
}


