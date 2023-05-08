package domain;

public class SmartPhone extends Phone{
	
	public boolean internet;
	public String company;
	public String model;

	public SmartPhone() {}

	public SmartPhone(String company, String model) {
		this.company = company;
		this.model = model;
	}
	
	public void doInternet() {
		System.out.println("인터넷을 연결합니다.");
		this.internet = true;
	}
	
	public void notDoInternet() {
		System.out.println("인터넷 연결을 해제합니다.");
		this.internet = false;
	}
	
	
	
	
	

}
