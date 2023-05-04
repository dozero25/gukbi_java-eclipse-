package obj;



class BookMall {
	private String bookTitle;
	private int bookPrice;
	private int bookStock;

	public BookMall() {
	}
	
	

	// getter setter : 입력(set)할 때 유혀성 체크하거나 외부에서 필드로 바로 접근x(캡슐화)
	// 필드 앞에 private
	// 저장(set), 출력(get)
	
	

	public String getBookTitle() {
		return bookTitle;
	}



	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}



	public int getBookPrice() {
		return bookPrice;
	}



	public void setBookPrice(int bookPrice) {
		if(bookPrice < 10000) {
			System.out.println("책 가격은 최소 10,000원 이상이어야 합니다.");
			this.bookPrice = 10000;
		}else {
			this.bookPrice = bookPrice;	
		}
	}


	public int getBookStock() {
		return bookStock;
	}



	public void setBookStock(int bookStock) {
		if(bookStock < 1) {
			System.out.println("재고가 없습니다.");
			this.bookStock = 0;
		}else {
			this.bookStock = bookStock;	
		}
		
	}



	public String showBook() {
		return "상품제목 : " + this.bookTitle 
				+ " | 상품가격 : " + this.bookPrice 
				+ " | 상품 재고 : "+this.bookStock;
	}

	public void showInfo() {
		System.out.println("상품제목 : " + this.bookTitle + " | 상품가격 : " + this.bookPrice+" | 상품 재고 : "+this.bookStock);
	}
}

public class Object_Ex04 {

	public static void main(String[] args) {
		BookMall[] book = new BookMall[2];
		book[0] = new BookMall();
		
		book[0].setBookTitle("자바");
		book[0].setBookPrice(10000);
		book[0].setBookStock(2);
		
		book[0].showInfo();
		
		book[1] = new BookMall();
		
		book[1].setBookTitle("스프링");
		book[1].setBookPrice(0);
		book[1].setBookStock(0);
		
		book[1].showInfo();
		
		
	}

}
