package tut01;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();

		int score[] = new int[a];

		for (int i = 0; i < score.length; i++) {
			score[i] = sc.nextInt();
		}

		System.out.print("[");
		for (int i = 0; i < score.length; i++) {
			System.out.print(" " + score[i]);
		}
		System.out.print(" ]");
		System.out.println();

//		for(출력데이터 타입 변수명 : 배열명) { sysout }

		int result = 0;
		for (int scores : score) {
			System.out.print(scores + " ");
			result += scores;
		}
		System.out.println();
		System.out.println("합 : " + result);
	}

}
