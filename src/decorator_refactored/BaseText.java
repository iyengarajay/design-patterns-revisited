package decorator_refactored;

import java.util.function.Function;

public class BaseText implements Function<String,String>{
	
	public BaseText(){
		System.out.println("called");
	}
 
	@Override
	public String apply(String t) {
		System.out.println("Calling apply...");
		return t;
	}
}
