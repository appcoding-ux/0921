package ex06_interface;

public class Printer implements CSPrint {

	@Override // 어노테이션 => 명시적으로 알려줄 수 있다.
	public void print(String msg) {
		System.out.println(msg);
	}

	@Override
	public void cprint(String msg) {
		System.out.print("이것은 컬러 프린터 : ");
		System.out.println(msg);
	}

}
