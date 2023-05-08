package object.domain;

public class Car2 {

	private String model;
	private int speed;
	private boolean start;
	
	
	public Car2() {}

	public Car2(String model, int speed, boolean start) {
		super();
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

	public boolean getStart() {
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

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	
	public void showCarInfo() {
		System.out.println("모델 : "+ this.model);
		System.out.println("속도 : "+ this.speed);
		System.out.println("시동 : "+ this.start);
	}
	
	
}
