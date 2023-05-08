package domain;

public class Register extends Company{

	public String url;
	
	public Register(String url) {
		super();
		this.url = url;
	}
	
	public void showInfo() {
		System.out.println(url);
	}
}
