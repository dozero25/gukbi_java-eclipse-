package article.domain;

import java.time.LocalDateTime;

public class Article {
	private int aID;
	private String subject;
	private String writer;
	private String content;
	private LocalDateTime regdate = LocalDateTime.now();
	
	public Article() {}

	public int getaID() {
		return aID;
	}

	public void setaID(int aID) {
		this.aID = aID;
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

	public LocalDateTime getRegdate() {
		return regdate;
	}


	public void setContent(String content) {
		this.content = content;
	}
	
	public void disp(Article article) {
		System.out.println("번호\t제목\t\t작성자\t내용\t\t시간");
		System.out.print(article.getaID()+"\t");
		System.out.print(article.getSubject()+"\t");
		System.out.print(article.getWriter()+"\t");
		System.out.print(article.getContent()+"\t");
		System.out.print(article.getRegdate());
	}
	
}
