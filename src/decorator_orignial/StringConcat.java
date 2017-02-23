package decorator_orignial;

public class StringConcat extends TextDecorator{
    Text text;
    public StringConcat(Text text){
        this.text = text;
    }
    public String format(String s){
    	System.out.println("concat"+s);
        return text.format(s).concat(s);
    }
}
