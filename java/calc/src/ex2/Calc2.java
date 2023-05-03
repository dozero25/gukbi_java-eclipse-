package ex2;

//1. 두 변수(국어, 영어)에 정수를 입력 받아 두 과목의 총점, 평균을 출력하는 프로그램을 작성하시오
//(1) 두 변수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
//(2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
//(3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
//단, 별도의 클래스를 만들지 않고 public class 내부에 메소드를 작성하여 출력한다.
//프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.


/*
 	1. 프로그램 명 : 국어, 영어 계산 프로그램
 	2. 작성일 : 2023.05.03
 	3. 윤도영
 	4. 내용 : 국어, 영어 점수를 메소드로 만들어 계산
 */
public class Calc2 {

	public static void main(String[] args) {
		sum(50, 60);

	}
	
	public static void sum(int kor, int eng) {
		if(kor < 0 || eng < 0) {
			System.out.println("계산할 수 없습니다.");
		} else if(kor > 100 || eng > 100) {
			System.out.println("계산할 수 없습니다.");
		} else {
			int total = kor + eng;
			double avg = total/(double)2;
			
			System.out.println("총점 : "+total+"점");
			System.out.println("평균 : "+avg+"점");
		}
		
	}

}

