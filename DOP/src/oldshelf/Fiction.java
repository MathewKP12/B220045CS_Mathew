package oldshelf;

public class Fiction extends Book {

	private final String name;
	private static FictionType type=FictionType.Tragedy;
	public Fiction(String title, String name) {
		super(title);
		this.name=name;
	}
	public String get_name(){
		return name;
	}
	public FictionType get_type(){
		return type;
	}
	@Override
	public String toString() {
		return super.toString()+"\nName: : "+name;
	}
}
