package oldshelf;

public class Comic extends Book {

	private final String Title;
	private final int ageOfMainCharacter;
	public Comic(String title,int ageOfMainCharacter) {
		super(title);
		this.Title=title;
		this.ageOfMainCharacter=ageOfMainCharacter;
	}
	public int get_age(){
		return ageOfMainCharacter;
	}
	public String get_title(){
		return Title;
	}
	@Override
	public String toString() {
		return super.toString()+"\nAge of main character: "+ageOfMainCharacter;
	}

	@Override
	public int hashCode() {
		if(Title!=null){
			return ageOfMainCharacter;
		}
		return 0;
	}
	 
	@Override
	public boolean equals(Object o) {
		if(o instanceof Comic){
			Comic c =(Comic) o;
			System.out.println(c.hashCode());
			if(c.hashCode()==this.get_age()){
				return true;
			}
		}
		return false;
		
	}
}
