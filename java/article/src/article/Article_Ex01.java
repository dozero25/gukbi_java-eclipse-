package article;

import java.util.ArrayList;
import java.util.List;

import article.dao.ArticleDao;
import article.domain.Article;

public class Article_Ex01 {

	public static void main(String[] args) {
		
		
		List<Article> atcList = new ArrayList<>(); 
		
		
		Article atc = new Article();
		
		ArticleDao dao = new ArticleDao();
		
		int num = 0;
		String title = "공지사항입니다.";
		String name = "관리자";
		String text = "게시판 테스트 입니다.";

//		for(int i = 0; i < 5; i++) {
//			atc.setaID(num++);
//			atc.setSubject(title);
//			atc.setWriter(name);
//			atc.setContent(text);
//		}
//		for(int i = 0; i < 5; i++) {
//			atc.disp(atc);
//		}
		
		for(int i = 0; i < 5; i++) {
			atc.setaID(num++);
			atc.setSubject(title);
			atc.setWriter(name);
			atc.setContent(text);
		}
		
		atcList.add(atc);
		
		dao.selectAritcle(atcList);
		
	}

}
