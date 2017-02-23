package function;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionInterface {
	
	
	public static void callMe(String input){
		System.out.println("Printing  text : "+ input);
	}
	
	public static String callMeAndReturn(String input){
		System.out.println("Printing  text and returning : "+ input);
		return "I can write code...";
	}
	
	public static void main(String[] args) {
		callMe("Hello");
		callMeAndReturn("Hello");

		Consumer<String> callMe = FunctionInterface::callMe;
		callMe.accept("Hello");
		
		
		
		Function<String,String> callMeAndReturn = FunctionInterface::callMeAndReturn;
		callMeAndReturn.apply("Hello");
		
		
	}

}
