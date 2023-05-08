package variable;

/*
	프로그램명 : 
	날짜 :
	이름 : 
	내용 : num1 값과 num2 값을 교환하기(교환을 위한 tmp 변수를 이용해서 작업)
 */


public class VariableExchange_Ex {

	public static void main(String[] args) {
		int num1, num2;
		
		num1 = 7;
		num2 = 3;
		
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		
		System.out.println();
		
		if(num1 > num2 ) {
			int tmp = num2;
			
			num2 = num1;
			
			num1 = tmp;
		}
		System.out.println("num1 : "+ num1);
		System.out.println("num2 : "+ num2);
		
		System.out.println();
		
		

	}

}
