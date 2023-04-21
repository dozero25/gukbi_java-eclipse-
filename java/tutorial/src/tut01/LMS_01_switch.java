package tut01;

/*
	switch ~ case ~  break (default);
	: 조건 - 등호 (=, >=, <=) 부등호를 사용할 수 없다.
*/

public class LMS_01_switch {

	public static void main(String[] args) {
		// T면 총점, A면 평균, 그 외에는 시스템 종료
		char sel = 'T';

		switch (sel) {
		case 'T':
			System.out.println("총점을 출력합니다.");
			break;
		case 'A':
			System.out.println("평균을 출력합니다.");
			break;

		default:
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);
		}

	}

}
