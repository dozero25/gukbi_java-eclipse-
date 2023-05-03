package Ex01;

import java.util.ArrayList;
import java.util.List;

import Ex01.model.Register;

public class ArrayList_Ex02_1 {

	public static void main(String[] args) {
		List<Register> list = new ArrayList<>();
		
		for(Register r : list) {
			System.out.println(r);
		}
		
		System.out.println(list.toString());

	}

}
