package oldshelf;

public class TextBook extends Book {

	private final String subject;
	public TextBook(String title, String subject) {
		super(title);
		this.subject=subject;
	}

	public String get_sub(){
		return subject;
	}
	
	@Override
	public String toString() {
		return super.toString()+" Subject: "+ subject;
	}

}
