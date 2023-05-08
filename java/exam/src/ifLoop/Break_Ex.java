package ifLoop;

public class Break_Ex {

	public static void main(String[] args) {
		// 주사위 난수를 발생시켜서 3이 나오면 프로그램을 종료
		boolean run = true;
		
		while(run) {
			int dice = (int)(Math.random() * 6)+1;
			System.out.println(dice);
			if( dice == 3) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		for(int i = 0; i <= 10; i++) {
			if(i % 2 == 0) {
				continue;
			}
			System.out.println(i);
		}
		
		for(int i = 0; i < 6; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
