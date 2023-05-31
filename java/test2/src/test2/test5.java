package test2;

import java.util.Scanner;


class Calc{
	
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

public class test5 {

	public static void main(String[] args) {
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
		
		
		c.subjectCalc(kor, math, eng);
		
	}
		
}
