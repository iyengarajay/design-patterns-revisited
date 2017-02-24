package string_count_decorator_refactored;

public class StringCountDecorator {

	public static String removeWhiteSpace(String input) {
		
		return input.replaceAll(" ", "");
	}

	public static String replaceDigitEmptyCharacter(String input) {
		
		return input.replaceAll("\\d+", "");
	}

}
