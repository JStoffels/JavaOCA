package dungeon;

public class GameWorld {

	private int border = 5;	
	
	public GameWorld() {
		for (int i = 0; i < border; i++) {
			for (int j = 0; j < border; j++) {
				world[i][j] = new Wall();
			}			
		}			
	}

	Square[][] world = new Square[border][border];

	Square getSquare(int x, int y){
		return world[y][x];}
}



