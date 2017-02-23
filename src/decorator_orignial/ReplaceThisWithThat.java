package decorator_orignial;

public class ReplaceThisWithThat extends TextDecorator {

	public ReplaceThisWithThat(Text text) {
		super(text);
	}

	public String format(String s) {
		return text.format(s).replaceAll("this", "that");
	}
}