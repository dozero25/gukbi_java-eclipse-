package variable;

public class VaribaleOpt_Ex {

	public static void main(String[] args) {
		//글자와 글자, 글자와 변수, 변수와 글자를 연결할 때 :   + 부호
		
		int hour = 9;
		int minutes = 31;
		
		System.out.println(hour + "시 "+minutes+"분입니다.");

		int result = (hour * 60) + minutes;
		
		System.out.println(result+"분");
	}

}
