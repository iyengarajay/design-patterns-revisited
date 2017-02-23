package string_count_decorator;

public class SimpleStringCounter implements StringCount {

	@Override
	public int count(String input) {
		return input.length();
	}

}
