package array;

public class ArrayCreate_Ex {

	public static void main(String[] args) {
		// 1. 선언 방법
		int[] num = new int[3];
		num[0] = 100;
		num[1] = 200;
		num[2] = 300;
		
		for(int res1 : num) {
			System.out.println(res1);
		}
		// 2. 선언과 초기화
		double[] d = new double[] {1.1, 1.2, 1.3};
		for(double res2 : d) {
			System.out.println(res2);
		}
		
		// 3. 초기화
		String[] season = {"Spring", "Summer", "Fall", "Winter"};
		
		for(String res3 : season) {
			System.out.println(res3);
		}
	}

}
