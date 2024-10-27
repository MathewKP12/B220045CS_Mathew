package oldshelf;

import java.util.Objects;

public final class TextBook extends Book {

	private final String subject;
	public TextBook(String title, String subject) {
		super(title);
		this.subject=subject;
	}
	public String title(){
		return super.getTitle();
	}

	public String subject(){
		return subject;
	}
	
	@Override
	public String toString() {
		return super.toString()+"\nSubject: "+ subject;
	}
	public boolean equals(Object obj){
		if(this==obj){
			return true;
		}
		if (!(obj instanceof TextBook tb)){
			return false;
		}
        return Objects.equals(title(), tb.title()) && Objects.equals(subject, tb.subject);
	}
	public int hashCode() {
        return Objects.hash(title(), subject);
    }
}
