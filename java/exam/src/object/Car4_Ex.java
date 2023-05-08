package object;

import object.domain.Car4;

public class Car4_Ex {

	public static void main(String[] args) {
		Car4 c4 = new Car4();
		
		c4.setModel("벤츠");
		c4.setColor("검은색");
		c4.setPrice(120000000);
		c4.setSpeed(120);
		c4.setStart(true);
		
		System.out.println(c4.getModel());
		System.out.println(c4.getColor());
		System.out.println(c4.getPrice());
		System.out.println(c4.getSpeed());
		System.out.println(c4.isStart());
		
		c4.showCarInfo();

	}

}
