package object;

import object.domain.Computer;

public class Computer_Ex {

	public static void main(String[] args) {
		Computer c = new Computer();
		
		c.setA(10);
		c.setB(5);
		
		c.powerOn();
		c.sum();
		c.multipy();
		c.powerOff();
	}

}
