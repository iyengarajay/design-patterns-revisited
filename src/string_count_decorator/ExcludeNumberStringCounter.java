package string_count_decorator;

public class ExcludeNumberStringCounter extends StringCountDecorator {

	//private StringCount characterCount;

	public ExcludeNumberStringCounter(StringCount characterCount) {
		super(characterCount);
	}

	public int count(String input) {
		
		String noNumbers = input.replaceAll("\\d+", "");
		return characterCount.count(noNumbers);
	}

}
