package newshelf;

public sealed interface IBook permits Comic1, Fiction1, TextBook {
    String  getTitle();
    public String toString();
}
