package tut01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LMS_01_java {

	public static void main(String[] args) {
		/*
		 	1. 국어, 영어, 수학 점수를 입력받아 총점 및 평균을 산출하시오.
		 		-변수 이름은 kor, eng, math, total, avg
		 		-국어, 영어, 수학, 총점은 정수, 평균은 실수로
		 */
		
		Scanner sc = new Scanner(System.in);
	
		while(true) {	
			System.out.print("국어 점수를 입력하세요 : ");
			int kor = sc.nextInt();
			if(kor > 100 || kor < 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			System.out.print("영어 점수를 입력하세요 : ");
			int eng = sc.nextInt();
			if(eng > 100 || eng < 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			System.out.print("수학 점수를 입력하세요 : ");
			int math = sc.nextInt();
			if(math > 100 || math < 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			
			int total = kor + eng + math;
			System.out.println("총 점수 : "+ total);
			
			double avg = total / 3;
			
			System.out.println("평균 : " + avg);
			
			break;
		}
		
		
		
		

	}

}
