package oca.examples;

class Writer implements MyInterface {
	int a = 1;
	int b = 10;
	int c = 3000;
	static int s = 100;
	public Writer () {}
	public Writer (int i) {this.a = i;}
	public static void write() {
		System.out.println("Writing...");
		System.out.println(s);

	}
	public void read() {
		System.out.println("Reading...");
		System.out.println(this.a);
		MyInterface.super.display(); //to call interface method when there are conflicts with same methods
		display();
	}
}

public class Programmer extends Writer {
	int a = 2;
	int b = 20;
	int d = 30000;
	static int s = 200;
	public Programmer () {super();}
	public Programmer (int i) {this();}
	public static void write() {
		System.out.println("Writing code");
		System.out.println(s);
	}
	public void read() {
		System.out.println("Reading code...");
		System.out.println(this.a);
	}
	public static void main(String[] args) {
		Writer w = new Programmer();
		//		Programmer w = (Programmer) new Writer();
		w.write();
		w.read();
		System.out.println();
		System.out.println(w.a);
		System.out.println(w.b);
		System.out.println(w.c);
		//		System.out.println(w.d);
		System.out.println(w.s);
	}
}
