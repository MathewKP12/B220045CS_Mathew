package newshelf;

public record Comic1(String Title,int ageofMainCharacter) implements IBook {
    public String getTitle(){
        return Title;
    }
    public int get_age(){
        return ageofMainCharacter;
    }
    public String toString(){
        return "Title: "+Title+"\nAge of main character: "+ageofMainCharacter;
    }
}
