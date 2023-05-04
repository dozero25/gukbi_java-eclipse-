package obj;

class BookMall {
	String bookTitle;
	int bookPrice;

	public BookMall() {
	}

	public BookMall(String bookTitle, int bookPrice) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
	}

	public String showBook() {
		return "상품제목 : " + this.bookTitle + " | 상품가격 : " + this.bookPrice;
	}

	public void showInfo() {
		System.out.println("상품제목 : " + this.bookTitle + " | 상품가격 : " + this.bookPrice);
	}
}

public class Object_Ex03 {

	public static void main(String[] args) {
		BookMall[] book = new BookMall[2];
		book[0] = new BookMall("자바", 10000);
		book[1] = new BookMall("스프링", 20000);
		
		for(int i = 0; i < book.length; i++) {
			System.out.println(book[i].showBook());
			book[i].showInfo();
		}
		
		BookMall[] book1 = new BookMall[2];
		for(int i = 0; i < book.length; i++) {
			book[i] = new BookMall("데이터베이스", 10000);
		}
		for(int i = 0; i < book.length; i++) {
			book[i].showInfo();
		}
	}

}
