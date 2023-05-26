package test;

import java.util.Scanner;

class Calc{
	
	public int subjectSum(int a, int b, int c) {
		
		int sum = 0;
		
		if(a < 0 || b < 0 || c < 0) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			sum = a+b+c;
			System.out.println(sum);
		}
		return sum;
	}
	
	public double subjectAvg(int sum) {
		
		double avg = 0;
		
		avg = (double)sum / 3;
		
		System.out.println(avg);
		
		return avg;
	}
	
	public double subjectCalc(int a, int b, int c) {
		
		int sum = 0;
		double avg = 0;
		
		if(a < 0 || b < 0 || c < 0) {
			System.out.println("계산할 수 없습니다.");
			return 0;
		} else {
			sum = a+b+c;
			System.out.println("총합 : "+sum);
			
			avg = (double)sum/3;
			double result = Math.round(avg * 100) / 100.0;
			System.out.println("평균 : "+result);
			
			return result;
		}
		
	}
}

public class Test5 {
	
	public static void main(String[] args) {
		// 국어, 영어, 수학 점수를 scanner로 입력받아 총점, 평균을 구하시오.
		// 국어, 영어, 수학 점수는 0보다 클 때만 총점, 평균을 구하며 0보다 작은 값을 입력하면 계산할 수 없습니다. 출력
		// 객체를 별도로 생성하며 메소르도 총점, 평균 구하는 프로그램을 작성
		
		Scanner sc = new Scanner(System.in);
		
		Calc c = new Calc();
		
		int kor = 0;
		int math = 0;
		int eng = 0;
		
		System.out.print("국어 점수 : ");
		kor = sc.nextInt();
		System.out.print("수학 점수 : ");
		math = sc.nextInt();
		System.out.print("영어 점수 : ");
		eng = sc.nextInt();
		
		int avg = c.subjectSum(kor, math, eng);
		c.subjectAvg(avg);
		
		c.subjectCalc(kor, math, eng);
		
	}
}
