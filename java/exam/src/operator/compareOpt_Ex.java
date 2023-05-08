package operator;

public class compareOpt_Ex {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(num1 >= num2);
		System.out.println(num1 == num2);
		System.out.println(num1 != num2);

		char c1 = 'A';
		char c2 = 'B';
		
		System.out.println(c1 >= c2);
		System.out.println(c1 == c2);
		System.out.println(c1 != c2);
		
		int i = 10;
		double d = 10.0;
		System.out.println(i == d);
		
		String str1 = "부산";
		String str2 = "이다";
		
		System.out.println(str1.equals(str2));
	}

}
