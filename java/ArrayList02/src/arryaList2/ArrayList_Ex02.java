package arryaList2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Board {
	String boardTitle;
	String boardWriter;
	String boardContent;
	
	public Board() {}
	
	public Board(String boardTitle, String boardWriter, String boardContent) {
		this.boardTitle = boardTitle;
		this.boardWriter = boardWriter;
		this.boardContent = boardContent;		
	}

	public String getBoardTitle() {
		return boardTitle;
	}

	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}

	public String getBoardWriter() {
		return boardWriter;
	}

	public void setBoardWriter(String boardWriter) {
		this.boardWriter = boardWriter;
	}

	public String getBoardContent() {
		return boardContent;
	}

	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	
	public String showList() {
		return "제목 : " + boardTitle + " | 작성자 : " + boardWriter + " | 내용 : " + boardContent;
	}
	
}

public class ArrayList_Ex02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Board> board = new ArrayList<>();
		
		boolean isFlag = true;

		int num = 1;
		
		while(isFlag) {
			System.out.println("================================");
			System.out.println("1. 게시물 등록 2. 게시물 목록 확인 3. 회원 삭제 프로그램 종료");
			System.out.println("================================");
			
			System.out.print("메뉴 선택 : ");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1 :
				System.out.println("게시물 등록");
				System.out.println("================================");
				System.out.println();

				System.out.print("제목 > ");
				String title = sc.next();

				System.out.print("작성자 > ");
				String writer = sc.next();

				System.out.print("내용 > ");
				String content = sc.next();

				board.add(new Board(title, writer, content));
				System.out.println("");
				
				break;
			case 2 :
				System.out.println("게시물 목록 확인");
				System.out.println("================================");
				System.out.println();
				if(board.size() < 1) {
					System.out.println("등록된 게시물이 없습니다.");
				} else {
					for(Board list : board) {
						num++;
						System.out.println(num+list.showList());
					}
				}
				System.out.println();
				
				break;
			default : 
				System.out.println("프로그램 종료");
				System.exit(0);
			}
		}
		
	}

}
