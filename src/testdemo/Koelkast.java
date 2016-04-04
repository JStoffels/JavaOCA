package testdemo;

public class Koelkast implements Vrieskist {
	int q = 5;
	Koelkast(){	}
	public void print(){System.out.println("blaat");}
	static Integer k = new Integer(5);
	
	public static void main(String[] args) {
		//System.out.println(k);
	
	float x = 5;
	int y = 6;
	char p = '9';
	
	int l = (int) Math.round(Double.parseDouble("-0.5"));
	
	System.out.println(l);
	
	//int z = x + y;
	float u = x + y;
	
	int vv = p + y;
	//char o = p + y;
	
	x++;
	y++;
	p++;
	//System.out.println(p);
	
	Vrieskist b = new Koelkast();
	//type = 6;
	new Koelkast();
	
	//int a=q + y; 
	
	//new Koelkast().q;
	}
}
