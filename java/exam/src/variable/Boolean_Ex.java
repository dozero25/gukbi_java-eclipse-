package variable;

public class Boolean_Ex {

	public static void main(String[] args) {
		// true 출발, false 정지하는 프로그램
		
		boolean run = false;
		
		if(run == false) {
			System.out.println("정지");
		} else {
			System.out.println("출발");
		}
		
		int num1 = 5;
		boolean r1 = num1 == 10;
		System.out.println(r1);
		System.out.println(num1 == 10);
		System.out.println(num1 != 10);
		
		System.out.println(num1 == 10 ? true : false);

	}

}
