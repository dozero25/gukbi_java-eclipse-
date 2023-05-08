package object.domain;

public class Car3 {

	private String model;
	private int speed;
	private boolean start;
	
	public Car3() {}
	
	public Car3(String model) {
		this.model = model;
	}
	public Car3(String model, int speed) {
		
		this.model = model;
		this.speed = speed;
		
	}
	public Car3(String model, int speed, boolean start) {
		
		this.model = model;
		this.speed = speed;
		this.start = start;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean getStart() {
		return start;
	}

	public void setStart(boolean start) {
		this.start = start;
	}
	
	public void showCarInfo() {
		System.out.println("모델 : "+ this.model);
		System.out.println("속도 : "+ this.speed);
		System.out.println("시동 : "+ this.start);
	}
	
	
	

}
