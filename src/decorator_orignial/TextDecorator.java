package decorator_orignial;

public abstract class TextDecorator implements Text {

	Text text;

	public TextDecorator(Text text) {
		this.text = text;
	}

	public abstract String format(String s);
}
