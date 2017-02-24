package string_count_decorator_refactored;

import java.util.function.Function;
import java.util.stream.Stream;

public class StringCounterTest {
	
	public static void main(String[] args) {

		Function<String,String> removeWhiteSpace = StringCountDecorator::removeWhiteSpace;
		Function<String,String> replaceDigitWithEmptyCharacter = StringCountDecorator::replaceDigitEmptyCharacter;
		
		SimpleStringCounter stringCount = new SimpleStringCounter();

		System.out.println(Stream.of(removeWhiteSpace,replaceDigitWithEmptyCharacter)
				                 .reduce(Function.identity(), Function::andThen)
								 .andThen(stringCount).apply("alpha99 beta"));
	}

}
