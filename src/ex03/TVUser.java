package ex03;

public class TVUser {
	public static void main(String[] args) {
		TV tv = new SamsungTV();
		tv.powerOn();;
		tv.volumUp();
		tv.volumDown();
		tv.powerOff();
	}
}