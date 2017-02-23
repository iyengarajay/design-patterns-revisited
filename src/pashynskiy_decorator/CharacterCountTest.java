package pashynskiy_decorator;

public class CharacterCountTest {
	public static void main(String[] args) {
		NonWhiteSpaceCharacterCount nonWhiteSpaceCharacterCount = 
				new NonWhiteSpaceCharacterCount(new SimpleCharacterCount());
		System.out.println(nonWhiteSpaceCharacterCount.count(" abc de"));
	}

}
