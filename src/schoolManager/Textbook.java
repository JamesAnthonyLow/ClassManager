package schoolManager;

public class Textbook {
	private String title;
	private String author;
	private String publisher;
	private String price;
	
	public Textbook(){
		
	}
	
	public void setTextbook(String title, String author, String publisher, String price) {
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
	}


	@Override
	public String toString() {
		return "Textbook [title=" + title + ", author=" + author
				+ ", publisher=" + publisher + ", price=" + price + "]";
	}
}
