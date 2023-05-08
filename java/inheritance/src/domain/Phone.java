package domain;

public class Phone {

	public void turnOn() {
		System.out.println("전원을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	
	public void bell() {
		System.out.println("벨이 울립니다.");
	}
	
	public void sendMsg(String msg) {
		System.out.println("보낸 메시지 : "+ msg);
	}

	public void receiveMsg(String msg) {
		System.out.println("받은 메시지 : "+ msg);
	}
}
