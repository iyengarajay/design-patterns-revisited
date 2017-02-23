package static_factory;

public class AnimalFactory {

	public static Animal create(String type) {
		
		//may be using if
		switch (type) {
		case "dog":
			return new Dog();
			
		case "duck":
			return new Duck();

		default:
			throw new RuntimeException("Animal is extinct");

		}
	}

}
