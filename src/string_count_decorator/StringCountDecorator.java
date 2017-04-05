package string_count_decorator;

public abstract class StringCountDecorator implements StringCount {
	
	protected StringCount characterCount;
	
	public StringCountDecorator(StringCount stringCount){
		this.characterCount=stringCount;
	}


	public abstract int count(String input);

}
