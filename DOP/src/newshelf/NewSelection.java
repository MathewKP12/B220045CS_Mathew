package newshelf;
class tathva{}
public class NewSelection {
	public static String getAgeOrTitle(Object o) {
		if (o instanceof IBook) {
			if(o instanceof Comic1 c){
				return c.Title();
			}
			else if (o instanceof Fiction1 f){
				return f.name();
			}
			else if (o instanceof TextBook tb){
				return tb.subject();
			}
		}
		else{
			return " ";
		}
		return null;
	}

	public static void main(String[] args) {
		
		Comic1 c = new Comic1("Far away from Home", 25);
		Comic1 c1 = new Comic1("Incredible Hulk", 2000);
		Fiction1 f = new Fiction1("Bron Season", "J J Redick");
		TextBook t = new TextBook("Infiniteness of Infinity realized in pi", "Mathematics");
		tathva g = new tathva();
		System.out.println(getAgeOrTitle(c));
		System.out.println(getAgeOrTitle(f));
		System.out.println(getAgeOrTitle(t));
		System.out.println(getAgeOrTitle(g));
		System.out.println(c.equals(c));
		System.out.println(c.equals(c1));
		
	}
}
