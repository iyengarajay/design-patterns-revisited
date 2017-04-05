package string_count_decorator;

public class NonWhiteSpaceStringCounter extends StringCountDecorator {


	public NonWhiteSpaceStringCounter(StringCount characterCount) {
		super(characterCount);
	}

	public int count(String input) {
		String noWhiteSpace = input.replaceAll(" ", "");
		return characterCount.count(noWhiteSpace);
	}

}
