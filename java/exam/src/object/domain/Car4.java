package object.domain;

public class Car4 {
	
	private String model;
	private String color;
	private int price;
	private int speed;
	private boolean start;
	
	public Car4() {}

	public Car4(String model, String color, int price, int speed, boolean start) {
		this.model = model;
		this.color = color;
		this.price = price;
		this.speed = speed;
		this.start = start;
	}

	

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		if(price < 0) {
			System.out.println("잘못 입력하셨습니다.");
			this.price = 1000000;
		}
		this.price = price;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if(speed < 0) {
			System.out.println("잘못 입력하셨습니다.");
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}
	public boolean isStart() {
		return start;
	}

	public void setStart(boolean start) {
		if(start == false) {
			System.out.println("시동 off");
			this.start = start;
		} else {
			System.out.println("시동 on");
			this.start = start;
		}
		
	}
	
	public void showCarInfo() {
		System.out.println("모델 : "+ this.model);
		System.out.println("색상 : "+ this.color);
		System.out.println("가격 : "+ this.price);
		System.out.println("속도 : "+ this.speed);
		System.out.println("시동 : "+ this.start);
	}
	
	
	

}
