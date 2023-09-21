package ex04;

public class MainClass {
	public static void main(String[] args) {
		
		A a = new B();
		B b = (B)a;
		
		b.funcA();
	}
}