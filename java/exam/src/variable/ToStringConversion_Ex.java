package variable;

public class ToStringConversion_Ex {

	public static void main(String[] args) {
		String str = "1234";
		int num1 = Integer.parseInt(str);
		
		int num2 = 100;
		
		System.out.println(str + num1);
		System.out.println(num2 + num1);
		
		
		int num3 = 100;
		int num4 = 200;
		String a = String.valueOf(num3);
		String b = String.valueOf(num4);
		
		System.out.println(a + b);

	}

}
