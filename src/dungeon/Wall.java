package dungeon;

public class Wall extends Square {

static String description = "Je loopt tegen een muur!";

@Override
String getDescription(){
	return description;
}
}
