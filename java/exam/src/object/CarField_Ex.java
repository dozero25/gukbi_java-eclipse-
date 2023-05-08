package object;

import object.domain.Car2;

public class CarField_Ex {

	public static void main(String[] args) {
		// 자동차 객체를 생성하여 필드에 모델명, 시동, 속도를 표시하는 프로그램 완성하시오. 
		
		Car2 c2 = new Car2();
		c2.setModel("현대");
		c2.setSpeed(80);
		c2.setStart(true);
		
		c2.showCarInfo();
	}
}
