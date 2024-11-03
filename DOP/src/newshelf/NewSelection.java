package newshelf;

class tathva{}

public class NewSelection {
	public static String getAgeOrTitle(Object o) {
		return switch(o){
			case Comic1(String Title,int age) when age > 10 -> "new movie " + Title;
			case Comic1(String Title,int age) when age <= 10 -> Title;
			case Fiction1(String title, String name) ->name;
			case TextBook(String t, String s) -> s;
			case Integer I -> Integer.toString(I);
			case String s -> s;
			default -> " ";
		};
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
		System.out.println(getAgeOrTitle(10));
		System.out.println(getAgeOrTitle("SSL > NSL :)"));
		System.out.println(getAgeOrTitle(g));
		System.out.println(c.equals(c));
		System.out.println(c.equals(c1));
		
	}
}
