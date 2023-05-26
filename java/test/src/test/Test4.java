package test;


public class Test4 {
	public static void main(String[] args) {
		// a-z까지 출력하는 프로그램
//		char 문자 처리하는 타입이지만 숫자로 표현이 가능
		
		for(int i = 97; i < 123; i++) {
			
			char al = (char) i;
			
			System.out.print(al+" ");
		}
		System.out.println();
		int i = 97;
		while(i <= 122) {
			System.out.print((char)i + " ");
			i++;
		}
		
		System.out.println();
		int j = 97;
		do {
			System.out.print((char)j + " ");
			j++;
		} while(j <= 122);
	}
	
	
}
