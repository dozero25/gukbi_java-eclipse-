package variable;

public class String_Ex {

	public static void main(String[] args) {
		String ydy = "123456-1234567";

		
		System.out.println(ydy.substring(7, 8));
		
		if(ydy.substring(7, 8).equals("1")) {
			System.out.println("Male");
		} else {
			System.out.println("Female");
		}
		
		System.out.println("====================");
		
		int tmp = Integer.parseInt(ydy.substring(7, 8));
		// 1, 3 남자 2, 4 % 2 == 0;
		if(tmp % 2 == 1) {
			System.out.println("남성입니다.");
		} else {
			System.out.println("여성입니다.");
		}
		
		String s1 = "부산";
		String s2 = "Korea It";
		String s3 = "아카데미";
		
		System.out.println(s1 + " " +s2 + " "+ s3);
		
		System.out.println("부산 \"코리아아이티\" 아카데미");
		
		
		//escape 문자
		// \t(탭: 7칸 띄우기), \n(개행)
		String str = "입력보기수정삭제"; // CRUD Create Read Update Delete
		System.out.println(str);

		String str1 = "입력\n보기\n수정\n삭제";
		System.out.println(str1);
		
	}

}
