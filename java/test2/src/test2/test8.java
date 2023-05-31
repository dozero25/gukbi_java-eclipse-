package test2;

public class test8 {

	public static void main(String[] args) {
		
		int[] arr = new int[8];
		
		arr[0] = 8;
		arr[1] = 3;
		arr[2] = 1;
		arr[3] = 6;
		arr[4] = 2;
		arr[5] = 4;
		arr[6] = 5;
		arr[7] = 9;
		
		int num = 0;
		
		for(int i = 0; i < arr.length; i++) {
			
			num = arr[i];
			
			if(num % 2 == 0) {
				System.out.println(num);
			}
		}
		
		
	
		
	}
		
}
