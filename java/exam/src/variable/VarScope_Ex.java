package variable;

public class VarScope_Ex {

	public static void main(String[] args) {
		//scope : 변수의 값이 미치는 범위(자기를 감싸고 있는 중괄호 안에서만 영향)
		
		int num1 = 100;
		int num2 = 0;
		
		if(num1 >= 10) {
			num2 = num1 + 200;
		}
		System.out.println(num1+ num2);
		

	}

}
