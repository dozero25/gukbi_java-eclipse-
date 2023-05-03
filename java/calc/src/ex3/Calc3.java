package ex3;

public class Calc3 {
	
	private int kor;
	private int eng;
	
	public void sum(int kor, int eng) {
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

	

