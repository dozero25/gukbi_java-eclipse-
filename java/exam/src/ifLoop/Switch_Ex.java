package ifLoop;

public class Switch_Ex {

	public static void main(String[] args) {
		// 임의의 수 = 난수 = random
		// Math.random() -> 실수(0) -> 형변환 -> + 1
		// 주사위 : 1 - 6
		int random = (int) (Math.random() * 3 )+ 1;
		
		if( random == 1) {
			System.out.println("가위");
		} else if (random == 2) {
			System.out.println("바위");
		} else if (random == 3 ) {
			System.out.println("보");
		}
		
		System.out.println(random);
		
		switch(random) {
		case 1 :
			System.out.println("가위");
			break;
		case 2 :
			System.out.println("바위");
			break;
		case 3 :
			System.out.println("보");
			break;
		
		}
		
		char grade = 'a';
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("A");
			break;
		case 'B':
		case 'b':
			System.out.println("B");
			break;
		case 'C':
		case 'c':
			System.out.println("C");
			break;
		
		}
	}

}
