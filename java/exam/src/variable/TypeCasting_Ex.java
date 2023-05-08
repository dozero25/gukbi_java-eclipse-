package variable;

public class TypeCasting_Ex {

	public static void main(String[] args) {
		// Type Casting = 형변환
		
		// Byte > char > int > float > double

		int var = 10;
		
		byte b = (byte) var;
		
		System.out.println(b);
		
		int i = 66;
		
		char c = (char) i; // 아스키 코드로 변환
		
		System.out.println(c);
		
		//double -> int
		double PI = 3.14;
		
		int result = (int) PI;
		
		System.out.println(result);
	}

}
