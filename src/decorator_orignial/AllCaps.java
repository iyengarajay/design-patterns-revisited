package decorator_orignial;

public class AllCaps extends TextDecorator {

	Text text;

	public AllCaps(Text text) {
		this.text = text;
	}

	public String format(String s) {
		System.out.println("All caps" + s);
		return text.format(s).toUpperCase();
	}
}
