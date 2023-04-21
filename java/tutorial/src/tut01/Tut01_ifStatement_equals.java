package tut01;

import java.util.Scanner;

public class Tut01_ifStatement_equals {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 문자열 변환
		// 대소문자 구분 없이 비교
		
		String sysPwd = "abcdef";
		String priPwd = "ABCDEF";
		
		if(sysPwd.equals(priPwd)) {
			System.out.println("success");
		}
		else {
			System.out.println("false");
		}
		
		if(sysPwd.equalsIgnoreCase(priPwd)) {
			System.out.println("성공");
		}
		
		boolean b = sysPwd.equalsIgnoreCase(priPwd);
		
		System.out.println(b);

		if(sysPwd.equalsIgnoreCase(priPwd) == true) {
			System.out.println("진짜요");
		}
		
		System.out.println(sysPwd.toUpperCase());
		
		String myNmae = "do young";
		System.out.println(myNmae.toUpperCase());
		System.out.println(myNmae);
		System.out.println(myNmae.toLowerCase());
		System.out.println(myNmae);
		
		System.out.println("----------------------");
		// 문자열 비교 : equals
		// 메모리 주소를 비교 : ==
		
		String s1 = "abc";
		String s2 = new String ("abc"); // 객체 생성
		
		if(s1.equals(s2)) {
			System.out.println("값이 일치합니다.");
		}
		
		if(s1 == s2) {
			System.out.println("메모리 주소(저장위치)가 일치합니다.");
		}
		else {
			System.out.println("메모미 주소(저장위치)가 다릅니다.");
		}
		
		// !(반전)
		
		if( b ) {
			System.out.println(!b);
		}
		
		// 논리 연산자
		// &&(모두 참일때 참), || (하나만 참일 때도 참)
		
		int point = 80;
		char grade = 'b';
		
		// 포인트가 90 이상 이면서 등급이 a면 골드 : &&
		if(point >= 80 && grade == 'a') {
			System.out.println("골드");
		}
		else {
			System.out.println("실버");
		}
 		// 포인트가 80 이상 이거나 등급이 a면 골드 : ||
		if(point >= 80 || grade == 'a') {
			System.out.println("골드");
		}
		else {
			System.out.println("실버");
		}
	}

}
