package ex5;

import java.util.Scanner;

public class Calc5 {
	Scanner scanner = new Scanner(System.in);
	
	
	private int kor;
	private int eng;
	private int math;

	public void sum() {
		if(kor < 0 || eng < 0 || math < 0) {
			System.out.println("계산할 수 없습니다.");
		} else if(kor > 100 || eng > 100 || math > 100) {
			System.out.println("계산할 수 없습니다.");
		} else {
			int total = kor + eng + math;
			double avg = total/(double)3;
			
			System.out.println("총점 : "+total+"점");
			System.out.println("평균 : "+avg+"점");
		}
		
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	
	
	
}
