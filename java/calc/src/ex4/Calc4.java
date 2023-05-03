package ex4;

import java.util.ArrayList;
import java.util.List;

import javax.security.auth.Subject;

public class Calc4 {

	List<Integer> subject = new ArrayList<>();
	
	private int total = 0;
	private double avg = 0.0;
	
	public void addSubject(int kor, int eng, int math) {
		subject.add(kor);
		subject.add(eng);
		subject.add(math);
	}
	
	public void sum() {
		for(int i = 0; i<subject.size(); i++) {
			if(subject.get(i) < 0) {
				System.out.println("계산할 수 없습니다");
				break;
			} else if(subject.get(i) > 100) {
				System.out.println("계산할 수 없습니다.");
				break;
			} 
			else {
				total += subject.get(i);
				
				avg = total / (double)subject.size();
			}
		}
		
	}
	public void showPrintOut() {
		System.out.println("총점 : "+total+"점");
		System.out.println("평균 : "+avg+"점");
	}

}
