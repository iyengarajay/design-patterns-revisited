package factory_method;

public class AnimalCreator {
	public static void main(String[] args) {
		AnimalFactory animalFactory = new DuckFactory();
		Animal animal = animalFactory.create();
		animal.walk();
	}

}
