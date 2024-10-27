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
		int p=(int)Title.charAt(0);
		if(Title!=null){
			for(int c=1;c<Title.length();c++){
				p=Math.abs((p+(int)c)*(p+(int)c+1)/2+p);
			}
			
			return Math.abs((ageOfMainCharacter+p)*(ageOfMainCharacter+p+1)/2+p);
		}
		return 0;
	}
	 
	@Override
	public boolean equals(Object o) {
		if(o instanceof Comic c){
			System.out.println(c.hashCode());
			if(c.hashCode()==this.hashCode()){
				return true;
			}
		}
		return false;
		
	}
}
