package string_count_decorator;

public class StringCounterTest {
	public static void main(String[] args) {
		StringCount stringCounter = 
				new ExcludeNumberStringCounter(new NonWhiteSpaceStringCounter(new SimpleStringCounter()));
		System.out.println(stringCounter.count(" alpha beta"));
	}

}
