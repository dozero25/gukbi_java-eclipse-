package ex5;

import java.util.Scanner;

//1. 국어, 영어, 수학 점수를 Scanner 객체로 입력 받아 총점, 평균을 출력하는 프로그램을 작성하시오
//(1) 국어, 영어, 수학 점수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
//(2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
//(3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
//(4) 객체를 별도로 작성하여 작성한 객체에 메소드를 작성하여 출력한다.
//프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.

public class ShowOut {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Calc5 calc = new Calc5();
		
		System.out.print("국어 점수를 입력하세요 : ");
		calc.setKor(scanner.nextInt());
		System.out.print("영어 점수를 입력하세요 : ");
		calc.setEng(scanner.nextInt());
		System.out.print("수학 점수를 입력하세요 : ");
		calc.setMath(scanner.nextInt());
		
		calc.sum();
	}
	
	
}
