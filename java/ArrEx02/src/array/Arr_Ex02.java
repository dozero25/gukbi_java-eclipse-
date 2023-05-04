package array;

import java.util.Scanner;

class Board {
	private String boardTitle;
	private String boardName;
	private String boardContent;
	
	public Board() {}
	
	public Board(String boardTitle, String boardName, String boardContent) {
		this.boardTitle = boardTitle;
		this.boardName = boardName;
		this.boardContent = boardContent;
	}
	
	public String showMember() {
		return "제목 : "+ boardTitle + " | 이름 : "+ boardName + " | 콘텐츠 : "+ boardContent;
	}
	
	public void showInfo() {
		System.out.println("제목 : "+ boardTitle + " | 이름 : "+ boardName + " | 콘텐츠 : "+ boardContent);
	}
}


public class Arr_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Board[] board = new Board[5];
		for(int i = 0; i < board.length; i++) {
			System.out.print("제목 : ");
			String title = sc.next();
			
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("콘텐츠 : ");
			String content = sc.next();
			
			board[i] = new Board(title, name, content);
		}
		
		for(int i = 0; i < board.length; i++) {
			board[i].showInfo();
		}
		

	}

}
