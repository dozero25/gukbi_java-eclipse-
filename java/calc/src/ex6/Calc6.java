package ex6;

import java.util.ArrayList;
import java.util.List;

public class Calc6 {

	List<Integer> subject = new ArrayList<>();
	
	private int total;
	private double avg;
	
	public void compare() {
		for(int i = 0; i<subject.size(); i++) {
			if(subject.get(i) < 0) {
				System.out.println("계산할 수 없는 점수 입니다.");
				break;
			} else if(subject.get(i) > 100) {
				System.out.println("계산할 수 없는 점수 입니다.");
				break;
			} else {
				System.out.println("계산 가능한 점수입니다.");		
			}
		}
		
	}
	
	public void sum() {
		for(int i = 0; i<subject.size(); i++) {
			total += subject.get(i);
			
			avg = total / (double)subject.size();
		}
		
	}
	public void showPrintOut() {
		System.out.println("총점 : "+total+"점");
		System.out.println("평균 : "+avg+"점");
	}
	
	public void addSubject(int grade) {
		subject.add(grade);	
	}
	
	
	
}
