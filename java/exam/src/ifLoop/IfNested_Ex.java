package ifLoop;

public class IfNested_Ex {

	public static void main(String[] args) {
		// 90 이상인 점수 중에서 95 이상이면 A+, 90 이상이면 A
		// 80 이상인 점수 중에서 85 이상이면 B+, 80 이상이면 B

		int score = 87;
		
		if(score >= 90) {
			if(score >= 95) {
				System.out.println("A+");
			} else if(score >= 90 && score < 95) {
				System.out.println("A");
			}
		}else if (score >= 80 && score <= 89) {
			if(score >= 85 && score <= 89) {
				System.out.println("B+");
			} else if(score >= 80 && score < 85) {
				System.out.println("B");
			}
		}else {
			System.out.println("F");
		}
	}

}
