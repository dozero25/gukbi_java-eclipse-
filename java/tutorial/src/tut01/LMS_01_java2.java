package tut01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class LMS_01_java2 {

	public static void main(String[] args) {
		/*
		 * 1. 국어, 영어, 수학 점수를 입력받아 총점 및 평균을 산출하시오. -변수 이름은 kor, eng, math, total, avg
		 * -국어, 영어, 수학, 총점은 정수, 평균은 실수로
		 */
		Scanner sc = new Scanner(System.in);

		List<Integer> grade = new ArrayList<>();

		System.out.print("과목 수를 입력하세요 : ");
		int subject = sc.nextInt();

		for (int i = 0; i < subject; i++) {
			System.out.print("점수를 입력하세요 : ");
			grade.add(sc.nextInt());
		}

		System.out.println(grade);

		int total = 0;
		for (int i = 0; i < subject; i++) {
			total += grade.get(i);
		}

		System.out.println("총 점수 : " + total);

		int avg = total / subject;

		System.out.println("평균 : " + avg);

	}

}
