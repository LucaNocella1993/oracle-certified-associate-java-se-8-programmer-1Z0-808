package oca.examples;
interface MyInterface{  
	   public static int num = 100;
	   public default void display() {
	      System.out.println("display method of MyInterface " + num);
	   }
	}
	public class InterfaceExample implements MyInterface{
	   public void display() {
	      System.out.println("display method of class " + num);
	   }
	   public static void main(String args[]) {
	      InterfaceExample obj = new InterfaceExample();
	      obj.display();
	   }
	}