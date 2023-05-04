package array;

import java.util.Scanner;

class Board {
	private String subject;
	private String writer;
	private String content;
	private int visit = 0;

	public Board() {
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getVisit() {
		return visit;
	}

	public void setVisit(int visit) {
		this.visit = visit;
	}

	public String showMember() {
		return "제목 : " + subject + " | 이름 : " + writer + " | 콘텐츠 : " + content + " | 방문 횟수 : " + visit;
	}

	public void showInfo() {
		System.out.println("제목 : " + subject + " | 이름 : " + writer + " | 콘텐츠 : " + content + " | 방문 횟수 : " + visit);
	}
}

public class Arr_Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int ARRAY_COUNT = 1;
		Board[] board = new Board[ARRAY_COUNT];

		for (int i = 0; i < board.length; i++) {
			board[i] = new Board();

			System.out.print("게시판 제목 > ");
			String s = sc.next();

			System.out.print("작성자 > ");
			String u = sc.next();

			System.out.print("내용 > ");
			String c = sc.next();

			board[i].setSubject(s);
			board[i].setWriter(u);
			board[i].setContent(c);
			board[i].setVisit(2);

		}

		for (int i = 0; i < board.length; i++) {
			board[i].showInfo();
		}

	}

}
