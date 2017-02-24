package string_count_decorator_refactored;

import java.util.function.Function;

public class SimpleStringCounter implements Function<String,Integer> {

	@Override
	public Integer apply(String input) {
		
		return input.length();
	}

	

}
