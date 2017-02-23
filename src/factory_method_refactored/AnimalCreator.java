package factory_method_refactored;

public class AnimalCreator {

	public Animal createAnimal(AnimalFactory animal) {
		return animal.create();
	}

}
