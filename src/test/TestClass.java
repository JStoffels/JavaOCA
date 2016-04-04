package test;

import java.util.ArrayList;
import java.util.List;

public class TestClass {
	void getX(){}
	int f = 5;
	//public void TestClass(int i){}
	//long l1;
	
int location = 5;
void looper(){
	int f = 6;
	getX();
	f = 7;
}
	
	public static void main(String[] args) {
		
		for (int i=0 ; i<5 ; i++){
			System.out.println(i);
		}
		
		
		String a = "Hallo";
		String b = "Hallo";
		String c = new String("Hallo");
		String d = new String("Hallo");
		
		
		System.out.println(a.equals(b));
		System.out.println(a == b);
		System.out.println(c.equals(d));
		System.out.println(c == d);
		
		Integer x = new Integer(5);
		Integer y = new Integer(6);
		System.out.println(x + y);
		
	//	ArrayList<Integer> s1 = new ArrayList();
	//	s1.add("a");
		
	
	//	Boolean b = true;
	//	boolean c = true;
	//	int x = 5;
	//	int y = 7;
		
	switch (x){
	case 5+7: System.out.println("blaat");
	default: System.out.println("Bla");
	}
	}
}