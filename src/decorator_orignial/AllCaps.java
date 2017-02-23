package decorator_orignial;

public class AllCaps extends TextDecorator {

	public AllCaps(Text text) {
		super(text);
	}

	public String format(String s) {
		return text.format(s).toUpperCase();
	}
}
