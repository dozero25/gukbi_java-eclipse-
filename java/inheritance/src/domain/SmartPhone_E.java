package domain;

public class SmartPhone_E {

	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone("애플", "IPhone13");
		System.out.println("SmartPhone Spec : "+sp.company + "/"+ sp.model);

		
		sp.turnOn();
		sp.bell();
		sp.doInternet();
		sp.notDoInternet();
		sp.turnOff();
	}

}
