package oldshelf;

public abstract class Book {
	private final String title;
	public Book(String title) {
		this.title=title;
	}
	public String toString(){
		return "Title: "+title;
	}
}
