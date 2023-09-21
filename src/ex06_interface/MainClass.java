package ex06_interface;

public class MainClass {
	public static void main(String[] args) {
		Printable p = new Printer();
		
		String msg = "Hello world";
		
		p.print(msg);
		
		CSPrint print = new Printer();
		print.cprint("칼라");
	}
}
