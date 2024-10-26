package newshelf;

import oldshelf.FictionType;

public record Fiction1(String title, String name) implements IBook{
    private static FictionType type=FictionType.Tragedy;
    public String getTitle(){
        return title;
    }
    public FictionType get_type(){
        return type;
    }
    public String g_name(){
        return name;
    }
    public String toString(){
        return "Title: "+title+"\nName: "+name;
    }
}