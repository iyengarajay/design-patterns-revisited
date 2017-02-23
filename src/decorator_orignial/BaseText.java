package decorator_orignial;

public class BaseText implements Text{
    public BaseText(){
    	System.out.println("CALLED");
    }
    public String format(String s){
    	System.out.println("base text"+s);
        return s;
    }
}
