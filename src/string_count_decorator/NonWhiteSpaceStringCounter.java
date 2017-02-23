package string_count_decorator;

public class NonWhiteSpaceStringCounter extends StringCountDecorator {

	private StringCount characterCount;

	public NonWhiteSpaceStringCounter(StringCount characterCount) {
		this.characterCount = characterCount;
	}

	public int count(String input) {
		String noWhiteSpace = input.replaceAll(" ", "");
		return characterCount.count(noWhiteSpace);
	}

}
