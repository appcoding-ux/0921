package ex02;

public class LgTV {
	public void turnOn() {
		System.out.println("LgTV.. 전원 키다.");
	}
	public void turnOff() {
		System.out.println("LgTV.. 전원 끄다.");
	}
	public void soundUp() {
		System.out.println("LgTV.. 소리 올리다.");
	}
	public void soundDown() {
		System.out.println("LgTV.. 소리 내리다.");
	}
	
	SamsungTV tv = new SamsungTV();
}
