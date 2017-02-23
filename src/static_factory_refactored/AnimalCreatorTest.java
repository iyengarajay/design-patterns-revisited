package static_factory_refactored;

public class AnimalCreatorTest {

	public static void main(String[] args) {

		AnimalFactory animalFactory = new AnimalFactory();
		animalFactory.registerAnimal("dog", Dog::new);
		animalFactory.registerAnimal("cat", Duck::new);
		
		Animal animal = animalFactory.create("dog");
		animal.walk();

	}

}
