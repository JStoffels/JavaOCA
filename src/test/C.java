package test;


class A{

   public void move(){
      System.out.println("move A");
   }
}

class B extends A{

   public void move(){
      System.out.println("move B");
   }
   public void bark(){
      System.out.println("bark");
   }
}

public class C{

   public static void main(String args[]){
      A a = new A(); // Animal reference and object
      A b = new B(); // Animal reference but Dog object
      //B b1 = (B) new A();
      B b2 = new B();

      a.move();// runs the method in Animal class
      b.move();//Runs the method in Dog class
      //b.bark();
     // a.bark();
      b2.bark();
      ((B)b).move();
      
      b2.move();
      
      
   }
}