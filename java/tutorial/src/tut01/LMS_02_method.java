package tut01;

import java.util.Scanner;

public class LMS_02_method {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int kor, eng, math, total;
		double avg;

		kor = 80;
		eng = 78;
		math = 94;

		total = totalSum(kor, eng, math);
		avg = totalAvg(total);
		int sel = 0;

		while (true) {
			switch (sel = sc.nextInt()) {
			case 1:
				disp();
				System.out.println("총점을 출력합니다.");
				System.out.println(total);
				continue;
			case 2:
				disp();
				System.out.println("평균을 출력합니다.");
				System.out.println(avg);
				continue;
			case 3:
				disp();
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}

	// 화면출력 메소드
	public static void disp() {
		System.out.println("============Korea IT 성적관리시스템============");
	}

	// 객체 지향 : 메소드 오버로딩(이름이 같지만 타입이나 매개변수를 다르게 표현)
	// overloading
	public static int totalSum(int kor, int eng, int math) {

		int total = kor + eng + math;

		return total;
	}

	public static int totalAvg(int total) {

		int avg = total / 3;

		return avg;
	}

	// 기업 타이틀 메소드로 구현하기 : 반복 작업 또는 유지 보수를 편하게 하기 위해서
	// 접근제한자 static void 메소드 이름() {내용} : 화면에 출력하는 결과가 sysout
	// 접근제한자 static int 메소드 이름() { return 내용} : 화면에 출력하는 결과가 정수면
	// 접근제한자 static double 메소드 이름() { return 내용} : 화면에 출력하는 결과가 실수면
	// 접근제한자 static String 메소드 이름() { return 내용} : 화면에 출력하는 결과가 문자열이면

}
