package newshelf;

public record TextBook(String title, String subject) implements IBook {
    public String getTitle(){
        return title;
    }
    public String toString(){
        return "Title: "+title+"\nSubject: "+subject;
    }
}
