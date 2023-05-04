package obj;

class BookMall {
	String bookTitle;
	int bookPrice;
	int bookStock;
	boolean isSell = false; 
	
	public BookMall() {}
	
	public BookMall(String bookTitle, int bookPrice, int bookStock) {
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookStock = bookStock;
	}
}


public class Object_Ex02 {

	public static void main(String[] args) {
		BookMall[] book = new BookMall[2];
		
		for(int i = 0; i < book.length; i++) {
			book[i] = new BookMall("자바의 정석", 25000, 7);
			
		}
		
		for(int i = 0; i < book.length; i++) {
			System.out.println(book[i].bookTitle);
			System.out.println(book[i].bookPrice);
			System.out.println(book[i].bookStock);
		}
	}

}
