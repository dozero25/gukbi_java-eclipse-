package tut01;

import java.util.Scanner;

public class Tut10_IfStatement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		
		while(true) {
			int score = sc.nextInt();
			
			if(score > 100 || score < 0) {
				System.out.println("다시 입력하세요");
				continue;
			}
			else if(score >= 90 && score <= 100){
				System.out.println("A");
				break;
			}
			else if(score >= 80 && score < 90){
				System.out.println("B");
				break;
			}
			else if(score >= 70 && score < 80){
				System.out.println("C");
				break;
			}
			else if(score >= 60 && score < 70){
				System.out.println("D");
				break;
			}
			else {
				System.out.println("E");
				break;
			}
			
			
			
			
			
		}
		
	
		
		int a = sc.nextInt();
		int c = 0;
		for(int i = 0; i < a; i++) {
			int b = sc.nextInt();
			
			c += b;
			
		}
		
		System.out.println(c);
			
		
		//회원등급이 80이상이면 우수
		//회원등급이 50이상이면 보통
		//회원등급이 50미만이면 미가입
		//회원등급 변수명은 grade
		
		System.out.print("점수를 입력하세요 : ");
		int grade = sc.nextInt();
		
		if(grade >= 80 && grade <= 100) {
			System.out.println("우수");
		}
		else if(grade >= 50) {
			System.out.println("보통");
		}
		else {
			System.out.println("미가입");
		}
		
		System.out.println("---------------------");
		
		if(grade >= 80) 
			System.out.println("골드");
		
		else if(grade >= 50) 
			System.out.println("실버");
		
		else 
			System.out.println("브론즈");
		
		
		
		// 나머지가 0이면 짝수, 아니면 홀수 : %
		// 숫자 연산 후 같다는 ==
		// 두 변수의 글자가 같은 지 확인하는 것은 equals
		// if else 구문을 사용하는데 if는 한 번 만 
		// 변수명은 num
		
		int na = sc.nextInt();
		
		if(na % 2 == 0) {
			System.out.println("짝수");
		}
		else {
			System.out.println("홀수");
		}
		
		
		// 회사 시스템에 접속한다고 가정하고
		// 비밀번호를 비교
		// sysPwd
		// priPwd
		// 일치하면 로그인
		// 아니면 접근 거부
		
		String sysPwd = sc.next();
		String priPwd = "1234";
		
		if(sysPwd.equals(priPwd)) {
			System.out.println("로그인 성공");
		}
		else {
			System.out.println("로그인 실패");
		}
	}
	

}
