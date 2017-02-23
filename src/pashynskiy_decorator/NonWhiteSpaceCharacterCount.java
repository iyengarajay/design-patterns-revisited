package pashynskiy_decorator;

public class NonWhiteSpaceCharacterCount extends CharacterCountDecorator {

	private CharacterCount characterCount;

	public NonWhiteSpaceCharacterCount(CharacterCount characterCount) {
		this.characterCount = characterCount;
	}

	@Override
	public int count(String input) {
		String noWhiteSpace = input.replaceAll(" ", "");
		return noWhiteSpace.length();
	}

}
