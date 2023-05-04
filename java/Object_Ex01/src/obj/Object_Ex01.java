package obj;


class BookMall {
	String bookTitle;
	int bookPrice;
	int bookStock;
	
	public BookMall() {
		
	}	
}

public class Object_Ex01 {

	public static void main(String[] args) {
		// 책 정보 1개를 등록
		// 객체 : 책을 1권 등록할 때 필요 : new Book();
		
		BookMall[] book = new BookMall[2]; // 메모리에 new BookMall()이 들어갈 공간만 설정
		
		for(int i = 0; i < book.length; i++) {
			book[i] = new BookMall();
			book[i].bookTitle = "자바의 정석";
			book[i].bookPrice = 200000;
			book[i].bookStock = 99;
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.println(book[i].bookTitle+" | " +book[i].bookPrice+" | "+book[i].bookStock);
		}
	}

}
