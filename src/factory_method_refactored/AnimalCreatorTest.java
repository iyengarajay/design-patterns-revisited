package factory_method_refactored;

public class AnimalCreatorTest {

	public static void main(String[] args) {
	
			AnimalFactory duckFactory = () -> new Duck();
			AnimalFactory dogFactory = () -> new Dog();
			
			AnimalCreator animalCreator = new AnimalCreator();
			
			
			Animal animal = animalCreator.createAnimal(duckFactory);
			animal.walk();
			
		}

}
