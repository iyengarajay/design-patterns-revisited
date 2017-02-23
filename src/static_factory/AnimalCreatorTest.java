package static_factory;

public class AnimalCreatorTest {

	public static void main(String[] args) {

		Animal animal = AnimalFactory.create("dog");
		animal.walk();

	}

}
