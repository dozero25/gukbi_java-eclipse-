package Ex01;

import java.util.ArrayList;
import java.util.List;

public class ArrayList_Ex {

	public static void main(String[] args) {
		String[] board01 = new String[] {"가","나","다","라","마"};
		
		if(board01.length == 0) {
			System.out.println("등록된 게시물이 없습니다.");
		}else {
			System.out.println("등록된 게시물 수 : "+ board01.length + "개");
			System.out.println("===== 등록된 게시물을 보여줍니다 =====");
			for(String s : board01) {
				System.out.println(s);
			}
		}
		
		System.out.println();

		List<String> list = new ArrayList<>();
		
		list.add("가");
		list.add("나");
		list.add("다");
		list.add("라");
		list.add("마");
		
		
		if(list.isEmpty()) {
			System.out.println("가입된 회원이 없습니다.");
		} else {
			list.clear();
			System.out.println("가입 회원 수 : "+list.size()+"개");
			System.out.println("===== 등록된 게시물을 보여줍니다 =====");
			for(String l : list) {
				System.out.println(l);
			}
		}
		System.out.println(list.toString());
		

	}

}
