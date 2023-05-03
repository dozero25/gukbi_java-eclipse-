package Ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex02 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		
		for(int i = 0; i<3; i++) {
			int a = (i+1) * 100;
			
			list.add(a);
		}
		
		list.add(1, 500);
		list.remove(3);
		
		System.out.println(list.toString());
	}
	
}
