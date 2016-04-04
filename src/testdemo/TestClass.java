package testdemo;

public class TestClass {
	
	
	
	public static void main(String[] args) {
		System.out.println(new Base().x+", "+ new Base().y);
	}
	
	
	
}
	
class Base{
	static int x = 10;
	int y = 16;
}
