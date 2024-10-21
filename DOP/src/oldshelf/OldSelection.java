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
		
		if (o instanceof Book) {
			if(o instanceof Comic){
				Comic c= (Comic) o;
				return c.get_title();
			}
			else if (o instanceof Fiction){
				Fiction f = (Fiction) o;
				return f.get_name();
			}
			else if (o instanceof TextBook){
				TextBook tb = (TextBook) o;
				return tb.get_sub();
			}
		}
		else{
			return " ";
		}
		return null;
	}
	public static void main(String[] args) {
		Comic c = new Comic("Spiderverse", 12);
		Comic c1 = new Comic("Spiderverse I", 13);
		Fiction f = new Fiction("Hardy Boys", "Thomas J Paul");
		TextBook t = new TextBook("Study of microbiology", "Biology");
		game g = new game();
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(f));
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(g));
		System.out.println(c.equals(c));
		System.out.println(c.equals(c1));
	}
}
