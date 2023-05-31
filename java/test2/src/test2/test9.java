package test2;

public class test9 {

	public static void main(String[] args) {
		
		String reg = "001234-323456";
		
		int div = Integer.parseInt(reg.substring(7, 8));
		
		if(div % 2 == 0) {
			System.out.println("여자");
		} else {
			System.out.println("남자");
		}
		
	}
		
}
