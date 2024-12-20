package oldshelf;
class game{
}
public class OldSelection {

	//Complete this method.
	/**
	 * 
	 * @param o object
	 * returns if o is not a book, returns empty string, if Comic, returns title, of Fiction
	 * returns name, and if TextBook, returns subject.
	 */
	public static String getAgeOrTitle(Object o) {
		return switch(o){
			case Comic c -> c.get_title();
			case Fiction F -> F.get_name();
			case TextBook t -> t.subject();
			default -> "";
		};
	}
	public static void main(String[] args) {
		Comic c = new Comic("ab", 2);
		Comic c1 = new Comic("Spiderverse I", 13);
		Comic c2 = new Comic("ba", 2);
		Fiction f = new Fiction("Hardy Boys", "Thomas J Paul");
		TextBook t = new TextBook("Study of microbiology", "Biology");
		TextBook t1 = new TextBook("Study of microbiology-2", "Biology");
		game g = new game();
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(f));
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(g));
		System.out.println(c.equals(c));
		System.out.println(c.equals(c1));
		System.out.println(c.equals(c2));
		System.out.println();
		System.out.println(t.equals(t));
		System.out.println(t.equals(t1));
		System.out.println(t.hashCode());
		System.out.println(t1.hashCode());
	}
}
