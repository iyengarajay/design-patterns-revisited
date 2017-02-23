package decorator_orignial;

public class ReplaceThisWithThat extends TextDecorator{
    Text text;
    public ReplaceThisWithThat(Text text){
        this.text = text;
    }
    public String format(String s){
    	System.out.println("this with that"+s);
        return text.format(s).replaceAll("this","that");
    }
}