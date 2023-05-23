package article.dao;

import java.time.LocalDateTime;
import java.util.List;

import article.domain.Article;

public class ArticleDao {

	public void selectAritcle(List<Article> list) {
		System.out.println("번호\t제목\t\t작성자\t내용\t\t시간");
		forPrint(list);
	}
	
	public void selectAll(List<Article> list) {
		System.out.println("--------------------------------------------------------------------------------------");
		System.out.println("번호\t제목\t\t작성자\t내용\t\t\t시간");
		System.out.println("--------------------------------------------------------------------------------------");
		forPrint(list);
	}
	
	public void forPrint(List<Article> list) {
		for(int i = 0; i < list.size(); i++) {
			int id = list.get(i).getaID()+1;
			String subejct = list.get(i).getSubject();
			String writer = list.get(i).getWriter();
			String content = list.get(i).getContent();
			LocalDateTime regdate = list.get(i).getRegdate();
			
			System.out.println(id+"\t"+subejct+"\t"+writer+"\t"+content+"\t\t"+regdate);
			System.out.println("--------------------------------------------------------------------------------------");
		}
	}
}
