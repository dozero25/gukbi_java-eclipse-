package object.domain;

public class Computer {
	
	private int a;
	private int b;
	
	public Computer() {}

	public Computer(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	
	public void powerOn() {
		System.out.println("컴퓨터 전원을 켭니다.");
	}
	
	public void powerOff() {
		System.out.println("컴퓨터 전원을 종료합니다.");
	}
	
	public int sum() {
		int s = a + b;
		System.out.println(s);
		return s;
	}
	
	public int multipy() {
		int m = a*b;
		System.out.println(m);
		return m;
	}
	
	

}
