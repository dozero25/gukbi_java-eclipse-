package test2;

public class test1 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		
		int sum = 0;
		
		for(int i = 1; i < 1000; i++) {
			
			if(a / i == 0) {
				sum += i;
			} else if(b / i == 0) {
				sum += i;
			}
			
		}
		System.out.println(sum);

	}

}
