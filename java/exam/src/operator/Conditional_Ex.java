package operator;

public class Conditional_Ex {

	public static void main(String[] args) {
		// if 또는 삼항연산자 이용하여 출력
		// 1. 점수가 90 이상이면 a 아니면 b를 표시
		int score1 = 90;
		
		if(score1 >= 90) {
			System.out.println("A");
		} else {
			System.out.println("B");
		}
		
		String str = score1 >= 90 ? "A" : "B";
		System.out.println(str);
		
		// 2. 점수가 90 이상이면 a, 80 이상이면 b 아니면 c를 표시
		int score2 = 85;
		
		if(score2 >= 90) {
			System.out.println("A");
		} else if (score2 >= 80) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}

}
