package object;

import object.domain.Car3;

public class Car3_Ex {

	public static void main(String[] args) {
		Car3 c3 = new Car3();
		
		c3.setModel("벤츠");
		c3.setSpeed(100);
		c3.setStart(!false);
		
		System.out.println(c3.getModel());
		System.out.println(c3.getSpeed());
		System.out.println(c3.getStart());
		
		c3.showCarInfo();

	}

}
