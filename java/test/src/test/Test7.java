package test;

public class Test7 {
	
	public static void main(String[] args) {
		// 주민번호가 1,3이면 남자, 2,4면 여자로 출력하시오
		
		String jumin = "001234-323456";
		
		int div = Integer.parseInt(jumin.substring(7, 8));
		
		if(div % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
	}
}
